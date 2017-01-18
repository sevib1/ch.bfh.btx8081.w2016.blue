package ch.bfh.btx.blue.adimed.web;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx.blue.adimed.businessLayer.DashboardModel;
import ch.bfh.btx.blue.adimed.businessLayer.Patient;
import ch.bfh.btx.blue.adimed.businessLayer.PatientCase;
import ch.bfh.btx.blue.adimed.businessLayer.ScheduleModel;

/*
 * The Patient Schedule displays all the appointment of the day 
 * 
 * @created: Patrick Jolo
 * 
 * 
 */
@SuppressWarnings("serial")
@Theme("mytheme")
public class PatientenSchedule extends VerticalLayout implements View, Observer {

	HorizontalLayout TitleLayout;
	Label title;
	DateField date;
	Button logout;
	VerticalLayout scheduleLayout;
	HorizontalLayout BottomLayout;
	Button problems;
	Label synchronisierung;
	Button sync;
	Button detailButton;
	VerticalLayout allBox;

	Table scheduleTable;
	private ScheduleModel scheduleModel;
	private DashboardModel dashboardModel;

	public PatientenSchedule(DashboardModel dashboardModel) {
		this.dashboardModel = dashboardModel;
		scheduleModel = new ScheduleModel();
		scheduleModel.addObserver(this);

		// Title
		TitleLayout = new HorizontalLayout();
		title = new Label("Patienten Schedule");

		date = new DateField();
		date.setValue(new Date());
		date.setDateFormat("dd.MM.yyyy");

		logout = new Button("Logout");

		TitleLayout.addComponent(title);
		TitleLayout.addComponent(date);

		TitleLayout.addComponent(logout);
		TitleLayout.setMargin(true);
		TitleLayout.setSpacing(true);

		// layout for the patient schedule
		scheduleLayout = new VerticalLayout();
		scheduleTable = new Table();

		// button to go to the Dashboard
		detailButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				scheduleTable.getValue();
				
				getUI().getNavigator().navigateTo(MainPage.DASHBOARD);

			}
		});

		scheduleTable.setSelectable(true);

		detailButton.setIcon(new ClassResource("/medical-records.png"));

		// add Componetns to the layout
		scheduleTable.setPageLength(10);
		scheduleTable.setSizeFull();
		scheduleLayout.addComponents(scheduleTable);

		// Bottom
		BottomLayout = new HorizontalLayout();

		BottomLayout.addComponent(detailButton);

		// all layouts
		allBox = new VerticalLayout();
		allBox.addComponent(TitleLayout);
		allBox.addComponent(scheduleLayout);
		allBox.addComponent(BottomLayout);
		addComponent(allBox);
		addListenerToTable();
		scheduleModel.loadData();

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Observable o, Object arg) {
		BeanItemContainer<Patient> container = new BeanItemContainer<Patient>(Patient.class);
		container.addAll(scheduleModel.getPatient()); // Verknüpfung zwischen
														// Daten in MediModel
														// und MediView

		scheduleTable.setContainerDataSource(container);
		scheduleTable.refreshRowCache();
		scheduleTable.setVisibleColumns("firstName", "name", "city", "birthDate", "phoneNb", "sex", "zip", "street",
				"insurance", "insuranceNb", "allergy");// "laborDate",
		scheduleTable.setColumnHeaders("Vorname", "Name", "Stadt", "Geburtstag", "Tel.Nr", "Geschlecht", "PLZ",
				"Strasse", "Versicherung", "Versicherungs Nb", "Allergie");// "Datum",
	}
	
	public void addListenerToTable(){
		scheduleTable.addItemClickListener(new ItemClickEvent.ItemClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void itemClick(ItemClickEvent event) {
				
				Object o = event.getItem().getItemProperty("patientCase");
				o.toString();
				dashboardModel.setSelectedPatient(((PatientCase)event.getItem().getItemProperty("patientCase").getValue()).getPatient());
				detailButton.setEnabled(true);
								
			}
		});
}

}
