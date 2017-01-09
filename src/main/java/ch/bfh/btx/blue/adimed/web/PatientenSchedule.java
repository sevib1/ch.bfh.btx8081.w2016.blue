package ch.bfh.btx.blue.adimed.web;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx.blue.adimed.businessLayer.Medication;
import ch.bfh.btx.blue.adimed.businessLayer.Patient;
import ch.bfh.btx.blue.adimed.businessLayer.Schedule;
import ch.bfh.btx.blue.adimed.businessLayer.ScheduleModel;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;

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
	CheckBox checkAppear;
	Table scheduleTable;
	private ScheduleModel scheduleModel;

	public PatientenSchedule() {
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
		
		//layout for the patient schedule
		scheduleLayout = new VerticalLayout();
		scheduleTable = new Table();
//		scheduleTable.addContainerProperty("Versicherungsnummer", String.class, null);
//		scheduleTable.addContainerProperty("Name", String.class, null);
//		scheduleTable.addContainerProperty("Vorname", String.class, null);
//		scheduleTable.addContainerProperty("Geburtsdatum", String.class, null);
//		scheduleTable.addContainerProperty("Geschlecht", String.class, null);
//		scheduleTable.addContainerProperty("Termin", String.class, null);
//		scheduleTable.addContainerProperty("Erscheinen", CheckBox.class, null);
//		scheduleTable.addContainerProperty("Details", Button.class, null);
		
		//button to go to the Dashboard
	detailButton = new Button("", new Button.ClickListener() {
		
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(MainPage.DASHBOARD);

			}
		});

		detailButton.setIcon(new ClassResource("/medical-records.png"));
		
		checkAppear = new CheckBox();

//		scheduleTable.addItem(new Object[] { "834734667", "Panzoretti", "Marco", "23.08.1944", "m", "Freitag, 14:00",
//				checkAppear, detailButton }, 1);
		// scheduleTable.addItem(new
		// Object[]{"834787401","Hugentobler","Franziska","12.2.1969","w","Freitag,
		// 15:00",checkAppear,detailButton},2);
		
		//add Componetns to the layout
		scheduleTable.setPageLength(10);
		scheduleTable.setSizeFull();
		scheduleLayout.addComponents(scheduleTable);

		// Bottom
		 BottomLayout = new HorizontalLayout();
		 
		// problems = new Button("Probleme");
		// synchronisierung = new Label("letzte Synchronisierung: ");
		// sync = new Button("Synchronisieren");
		//
		 BottomLayout.addComponent(detailButton);
		// BottomLayout.setComponentAlignment(problems, Alignment.BOTTOM_LEFT);
		// problems.setSizeFull();
		// BottomLayout.addComponent(synchronisierung);
		// BottomLayout.setComponentAlignment(synchronisierung,
		// Alignment.BOTTOM_CENTER);
		// synchronisierung.setSizeFull();
		 //BottomLayout.addComponents(synch);
		// BottomLayout.setComponentAlignment(sync, Alignment.BOTTOM_RIGHT);
		// BottomLayout.setMargin(true);
		// BottomLayout.setSpacing(true);

		// all layouts
		allBox = new VerticalLayout();
		allBox.addComponent(TitleLayout);
		allBox.addComponent(scheduleLayout);
		allBox.addComponent(BottomLayout);
		addComponent(allBox);
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
		scheduleTable.setVisibleColumns("firstName","name","city","birthDate","phoneNb","sex","zip","street","insurance","insuranceNb","allergy");//"laborDate",
		scheduleTable.setColumnHeaders( "Vorname","Name","Stadt","Geburtstag","Tel.Nr","Geschlecht","PLZ","Strasse","Versicherung","Versicherungs Nb","Allergie");//"Datum",
	}

}
