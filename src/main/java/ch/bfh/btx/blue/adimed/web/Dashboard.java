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
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx.blue.adimed.businessLayer.DashboardModel;
import ch.bfh.btx.blue.adimed.businessLayer.Diagnosis;
import ch.bfh.btx.blue.adimed.businessLayer.LaborModel;
import ch.bfh.btx.blue.adimed.businessLayer.MediModel;
import ch.bfh.btx.blue.adimed.businessLayer.Patient;

//import ch.bfh.btx.blue.adimed.web.MainPage;

/*
 * The PatientDashboard displays all important information of a Patient
 * 
 * @created: Claudia Telesca
 * 
 * 
 */

@SuppressWarnings("serial")
public class Dashboard extends VerticalLayout implements View, Observer {

	HorizontalLayout titleLayout;
	Label titleLabel;
	Button backButton;
	HorizontalLayout adminDiagnoseLaborLayout;
	Panel adminPanel;
	HorizontalLayout diagnoseLaborLayout;
	Label diagnoseTitle;
	Table diagnoseGrid;
	Label laborTitle;
	Grid laborGrid;
	Grid gotGptGgt;
	Label mediLabel;
	Grid mediGrid;
	HorizontalLayout footerLayout;
	Button problemButton;
	Label lastSynchro;
	Button synchroButton;
	FormLayout adminForm;
	TextField patIDField;
	TextField nameField;
	TextField firstNameField;
	DateField birthDateField;
	TextField genderField;
	TextField phoneNbField;
	TextField streetField;
	TextField postCodeField;
	TextField allergyField;
	TextField commentField;
	TextField insuranceField;
	Button mediButton;
	Button laborButton;
	HorizontalLayout buttonLayout;
	private DashboardModel dashModel;
	private MediModel mediModel;
	private LaborModel laborModel;

	public Dashboard(DashboardModel dbm, MediModel mm, LaborModel lm) {
		mediModel = mm;
		laborModel = lm;
		dashModel = dbm;
		dashModel.addObserver(this);

		titleLayout = new HorizontalLayout();
		titleLayout.setMargin(true);
		titleLayout.setSpacing(true);
		titleLabel = new Label("Patienten Dashboard");

		backButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(MainPage.PATIENTSCHEDULE);

			}
		});
		backButton.setIcon(new ClassResource("/back.png"));
		backButton.setHeight("170%");

		titleLayout.addComponents(titleLabel, backButton);

		// layout for patient information and diagnosis
		adminDiagnoseLaborLayout = new HorizontalLayout();
		adminDiagnoseLaborLayout.setMargin(true);
		adminDiagnoseLaborLayout.setSpacing(true);

		// Patient information
		adminPanel = new Panel("Stamm- und Bewegungsdaten");
		adminForm = new FormLayout();
		patIDField = new TextField("Patienten-ID:");
		patIDField.setEnabled(false);
		// patIDField.setValue("12345678");
		patIDField.setWidth("70%");

		nameField = new TextField("Name:");
		nameField.setEnabled(false);
		// nameField.setValue("Panzoretti");
		nameField.setWidth("70%");

		firstNameField = new TextField("Vorname:");
		firstNameField.setEnabled(false);
		// firstNameField.setValue("Marco");
		firstNameField.setWidth("70%");

		birthDateField = new DateField("Geburtsdatum:");
		birthDateField.setEnabled(false);
		// birthDateField.setValue("23.08.1944");
		birthDateField.setWidth("70%");

		genderField = new TextField("Geschlecht:");
		genderField.setEnabled(false);
		// genderField.setValue("m");
		genderField.setWidth("70%");

		phoneNbField = new TextField("Telefonnummer:");
		phoneNbField.setEnabled(false);
		// phoneNbField.setValue("057 343 34 66");
		phoneNbField.setWidth("70%");

		streetField = new TextField("Strasse:");
		streetField.setEnabled(false);
		// streetField.setValue("Fazzolettistrasse 4");
		streetField.setWidth("70%");

		postCodeField = new TextField("PLZ, Ort:");
		postCodeField.setEnabled(false);
		// postCodeField.setValue("45689 Fazzolettitown");
		postCodeField.setWidth("70%");

		allergyField = new TextField("Allergien:");
		allergyField.setEnabled(false);
		// allergyField.setValue("alles mögliche");
		allergyField.setWidth("70%");

		commentField = new TextField("Bemerkungen:");
		commentField.setEnabled(false);
		// commentField.setValue("tendiert aggressiv zu sein");
		commentField.setWidth("70%");

		insuranceField = new TextField("Versicherung:");
		insuranceField.setEnabled(false);
		// insuranceField.setValue("KPT");
		insuranceField.setWidth("70%");

		adminPanel.setWidth("500");
		adminForm.addComponents(patIDField, nameField, firstNameField, birthDateField, genderField, phoneNbField,
				streetField, postCodeField, allergyField, commentField, insuranceField);
		adminPanel.setContent(adminForm);

		// View of the diagnosis
		diagnoseLaborLayout = new HorizontalLayout();
		diagnoseLaborLayout.setSizeFull();
		diagnoseLaborLayout.setSpacing(true);
		diagnoseTitle = new Label("Diagnosen");
		diagnoseGrid = new Table();

		// diagnoseGrid.addRow("Status nach:", "Alkoholabhängigkeit", "1.1.17");
		// diagnoseGrid.addRow("Verdacht auf:", "Leberzyrrhose", "1.1.16");

		// Button to change view to medication
		buttonLayout = new HorizontalLayout();
		mediButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				mediModel.setPatientCase(dashModel.getPatient().getPatientCase());
				getUI().getNavigator().navigateTo(MainPage.MEDIVIEW);

			}
		});
		mediButton.setIcon(new ClassResource("/healthy.png"));

		// Button to change view to labor results
		laborButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				laborModel.setPatientCase(dashModel.getPatient().getPatientCase());
				getUI().getNavigator().navigateTo(MainPage.LABORVIEW);

			}
		});
		laborButton.setIcon(new ClassResource("/chemistry.png"));

		// set buttons to the layout
		buttonLayout.addComponents(mediButton, laborButton);

		// layout for the bottom buttons
		// footerLayout = new HorizontalLayout();
		// problemButton = new Button("Probleme");
		// footerLayout.setSpacing(true);
		// lastSynchro = new Label("letzte Synchronisation: 123");
		// synchroButton = new Button("Synchronisieren");
		// footerLayout.addComponents(problemButton, lastSynchro,
		// synchroButton);

		// add all elements to the layouts
		diagnoseLaborLayout.addComponents(diagnoseTitle, diagnoseGrid, buttonLayout); // footerLayout
		adminDiagnoseLaborLayout.addComponents(adminPanel, diagnoseLaborLayout);

		// add elements to the main layout
		addComponents(titleLayout, adminDiagnoseLaborLayout);

	}

	@Override
	public void enter(ViewChangeEvent event) {
		dashModel.loadData();
	}

	public void update(Observable o, Object arg) {
		Patient p = dashModel.getPatient();
		patIDField.setValue(Integer.toString(p.getPID()));		
	
		nameField.setValue(p.getName());		
		
		firstNameField.setValue(p.getFirstName());		
		
		birthDateField.setValue(p.getBirthDate());
		
		genderField.setValue(Character.toString(p.getSex()));
		
		phoneNbField.setValue(p.getPhoneNb());
		
		streetField.setValue(p.getStreet());
		
		postCodeField.setValue(Integer.toString(p.getZip())+" "+ p.getCity());
		
		allergyField.setValue(p.getAllergy());
		
		insuranceField.setValue(p.getInsuranceNb());
		
		
		
		
		BeanItemContainer<Diagnosis> container = new BeanItemContainer<Diagnosis>(Diagnosis.class); 
		container.addAll(dashModel.getDiagnosis());
		diagnoseGrid.setContainerDataSource(container);
		diagnoseGrid.refreshRowCache();
		diagnoseGrid.setVisibleColumns("diagnosis", "status","diagnosisDate");// "laborDate",
		diagnoseGrid.setColumnHeaders("Diagnose", "Status", "Datum");// "Datum",
	}

}
