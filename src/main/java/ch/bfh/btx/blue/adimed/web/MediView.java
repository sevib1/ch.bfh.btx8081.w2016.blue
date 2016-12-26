package ch.bfh.btx.blue.adimed.web;

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
	
	public MediView() {

		mediModel = new MediModel();
		mediModel.addObserver(this);
		
		// set the title to the layout
		titelLayout = new HorizontalLayout();
		mediLabel = new Label("Medikationsübersicht");
		titelLayout.setMargin(true);
		titelLayout.setSpacing(true);
		

		//ArrayList<Medication> mList = new ArrayList<Medication>();

		// new grid for the medication
		mediGridLayout = new HorizontalLayout();
		mediGridLayout.setWidth("100%");

		mediTable = new Table();
//		mediTable.addColumn("Medikament", String.class);
//		mediTable.addColumn("Pharmacode", String.class);
//		mediTable.addColumn("Dosis", String.class);
//		mediTable.addColumn("Compendium", String.class);
//		mediTable.addColumn("Bereit", String.class);
//		mediTable.addColumn("Applikationsform", String.class);
//		mediTable.addColumn("Einahme", String.class);
//		mediTable.addColumn("Datum", String.class);
//		mediTable.addColumn("Bemerkung", String.class);
//		mediTable.setSizeFull();

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

//		mediGrid.addRow("RITALIN LA 40mg", "2510998", "40-60mg tgl.", "Link", "", "Tablette", "oral", "27.10.16",
//				"3 mal täglich");

		// add elements to the main layout
		addComponents(titelLayout, mediGridLayout);
		mediModel.loadData();
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}
	@Override
	public void update(Observable o, Object arg) {
		BeanItemContainer<Medication> container = new BeanItemContainer<Medication>(Medication.class);  
		container.addAll(mediModel.getMedication()); // Verknüpfung zwischen Daten in LaborModel und LaborView
		
		mediTable.setContainerDataSource(container);
		mediTable.refreshRowCache();
		//mediTable.setVisibleColumns("typeOfExamination", "results");//"laborDate", 
		//mediTable.setColumnHeaders( "Untersuchung", "Resultat");//"Datum",
	}

}
