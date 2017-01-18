package ch.bfh.btx.blue.adimed.web;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx.blue.adimed.businessLayer.MediModel;
import ch.bfh.btx.blue.adimed.businessLayer.Medication;

public class MediView extends VerticalLayout implements View,Observer{
	HorizontalLayout titelLayout;
	HorizontalLayout mediGridLayout;
	Button backButton;
	Label mediLabel;
	Table mediTable;
	private MediModel mediModel;
	
	public MediView(MediModel mm) {

		mediModel = mm;
		mediModel.addObserver(this);
		
		// set the title to the layout
		titelLayout = new HorizontalLayout();
		mediLabel = new Label("Medikationsübersicht");
		titelLayout.setMargin(true);
		titelLayout.setSpacing(true);
		
		// new grid for the medication
		mediGridLayout = new HorizontalLayout();
		mediGridLayout.setWidth("100%");
		mediGridLayout.setMargin(true);
		mediGridLayout.setSpacing(true);

		mediTable = new Table();

		// button to go back to the patient schedule
		backButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(MainPage.DASHBOARD);

			}
		});
		backButton.setIcon(new ClassResource("/back.png"));
		backButton.setHeight("170%");

		// add elements to the layout
		titelLayout.addComponents(mediLabel, backButton);
		mediGridLayout.addComponent(mediTable);
		// add elements to the main layout
		addComponents(titelLayout, mediGridLayout);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		mediModel.loadData();
	}
	@Override
	public void update(Observable o, Object arg) {
		BeanItemContainer<Medication> container = new BeanItemContainer<Medication>(Medication.class);  
		container.addAll(mediModel.getMedication()); // Verknüpfung zwischen Daten in LaborModel und LaborView
		
		mediTable.setContainerDataSource(container);
		mediTable.refreshRowCache();
		mediTable.setVisibleColumns("medName", "medDosis","applyDate","medStatus","applyForm","comment");//"laborDate", 
		mediTable.setColumnHeaders( "Name", "Dosis","Datum", "Status","Verabreichungsweg","Kommentar");//"Datum",
	}

}
