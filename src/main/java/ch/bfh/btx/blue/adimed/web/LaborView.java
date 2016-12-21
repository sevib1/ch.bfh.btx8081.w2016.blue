package ch.bfh.btx.blue.adimed.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx.blue.adimed.businessLayer.LaborModel;
import ch.bfh.btx.blue.adimed.businessLayer.LaborResult;

import com.vaadin.ui.Button.ClickEvent;

public class LaborView extends VerticalLayout implements View, Observer {

	HorizontalLayout laborLayout;
	VerticalLayout labGridLayout;
	Label laborTitle;
	Table laborTable;
	Button backButton;
	private LaborModel labModel;
	public LaborView() {
		labModel = new LaborModel();
		List labo = new ArrayList();
		labModel.addObserver(this);
		
		
		laborLayout = new HorizontalLayout();
		laborTitle = new Label("Laborresultate");
		laborLayout.setMargin(true);
		laborLayout.setSpacing(true);

		labGridLayout = new VerticalLayout();
		laborTable = new Table();/*
		laborTable.addColumn("Untersuchungsart", String.class);
		laborTable.addColumn("Datum", String.class);
		laborTable.addColumn("Resultat", String.class);*/

		backButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(MainPage.DASHBOARD);

			}
		});
		backButton.setIcon(new ClassResource("/back.png"));
		backButton.setHeight("170%");

		laborLayout.addComponents(laborTitle, backButton);
		labGridLayout.addComponent(laborTable);

//		laborTable.addRow("Urin", "12.07.16", "positiv");
//		laborTable.addRow("Kokain", "29.08.16", "negativ");

		addComponents(laborLayout, labGridLayout);
		labModel.loadData();

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Observable o, Object arg) {
		BeanItemContainer<LaborResult> container = new BeanItemContainer<LaborResult>(LaborResult.class);  
		container.addAll(labModel.getLabResults()); // Verknüpfung zwischen Daten in LaborModel und LaborView
		laborTable.setContainerDataSource(container);
		laborTable.refreshRowCache();
		laborTable.setVisibleColumns("typeOfExamination", "results");//"laborDate", 
		laborTable.setColumnHeaders( "Untersuchung", "Resultat");//"Datum",
	}
}
