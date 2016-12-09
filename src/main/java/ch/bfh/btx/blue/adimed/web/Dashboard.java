 package ch.bfh.btx.blue.adimed.web;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/*
 * The PatientDashboard displays all important information of a Patient
 * 
 * @created: Claudia Telesca
 * 
 * 
 */


public class Dashboard extends VerticalLayout{

	HorizontalLayout titleLayout;
	Label titleLabel;
	Button backButton;
	HorizontalLayout adminDiagnoseLaborLayout;
	Panel adminPanel;
	VerticalLayout diagnoseLaborLayout;
	Label diagnoseTitle;
	Grid diagnoseGrid;
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
	TextField birthDateField;
	TextField genderField;
	TextField phoneNbField;
	TextField streetField;
	TextField postCodeField;
	TextField allergyField;
	TextField commentField;
	TextField insuranceField;
	
	
	public Dashboard(){
		
		titleLayout = new HorizontalLayout();
		titleLayout.setMargin(true);
		titleLayout.setSpacing(true);
		titleLabel = new Label("Patienten Dashboard");
		backButton = new Button("Zurück zur Patientenübersicht");
		

		titleLayout.addComponent(titleLabel);
		titleLayout.addComponent(backButton);
		
		adminDiagnoseLaborLayout = new HorizontalLayout();
		adminDiagnoseLaborLayout.setMargin(true);
		adminDiagnoseLaborLayout.setSpacing(true);
		adminPanel = new Panel("Stamm- und Bewegungsdaten");
		adminForm = new FormLayout();
		patIDField = new TextField("Patienten-ID");
		patIDField.setEnabled(false);
		patIDField.setValue("12345678");
		patIDField.setWidth("70%");
		
		nameField = new TextField("Name:");
		nameField.setEnabled(false);
		nameField.setValue("Panzoretti");
		nameField.setWidth("70%");
		
		
		firstNameField = new TextField("Vorname:");
		firstNameField.setEnabled(false);
		firstNameField.setValue("Marco");
		firstNameField.setWidth("70%");
		
		birthDateField = new TextField("Geburtsdatum:");
		birthDateField.setEnabled(false);
		birthDateField.setValue("23.08.1944");
		birthDateField.setWidth("70%");
		
		genderField = new TextField("Geschlecht:");
		genderField.setEnabled(false);
		genderField.setValue("m");
		genderField.setWidth("70%");
		
		phoneNbField = new TextField("Telefonnummer:");
		phoneNbField.setEnabled(false);
		phoneNbField.setValue("057 343 34 66");
		phoneNbField.setWidth("70%");
		
		streetField = new TextField("Adresse:");
		streetField.setEnabled(false);
		streetField.setValue("Fazzolettistrasse 4");
		streetField.setWidth("70%");
		
		postCodeField = new TextField("Adresse:");
		postCodeField.setEnabled(false);
		postCodeField.setValue("45689 Fazzolettitown");
		postCodeField.setWidth("70%");
		
		
		allergyField = new TextField("Allergien:");
		allergyField.setEnabled(false);
		allergyField.setValue("alles mögliche");
		allergyField.setWidth("70%");
		
		commentField = new TextField("Bemerkungen:");
		commentField.setEnabled(false);
		commentField.setValue("tendiert aggressiv zu sein");
		commentField.setWidth("70%");
		
		insuranceField = new TextField("Versicherung:");
		insuranceField.setEnabled(false);
		insuranceField.setValue("KPT");
		insuranceField.setWidth("70%");
		
		
//		adminPanel.setSizeFull();
		adminPanel.setWidth("500");
		adminForm.addComponents(patIDField,nameField, firstNameField, birthDateField, genderField, phoneNbField, streetField,postCodeField,allergyField, commentField, insuranceField);
		adminPanel.setContent(adminForm);
		
		
		diagnoseLaborLayout = new VerticalLayout();
		diagnoseLaborLayout.setWidth("100%");
		diagnoseLaborLayout.setSpacing(true);
		diagnoseTitle = new Label("Diagnosen");
		diagnoseGrid = new Grid();
		diagnoseGrid.addColumn("Status", String.class);
		diagnoseGrid.addColumn("Diagnose", String.class);
		diagnoseGrid.addColumn("Datum", String.class);
		
		diagnoseGrid.addRow("Status nach:" , "Alkoholabhängigkeit", "1.1.17");
		diagnoseGrid.addRow("Verdacht auf:" , "Leberzyrrhose", "1.1.16");
		
		
		laborTitle = new Label("Laborresultate");
		laborGrid = new Grid();
		laborGrid.addColumn("Untersuchungsart", String.class);
		laborGrid.addColumn("Datum", String.class);
		laborGrid.addColumn("Resultat", String.class);
		
		laborGrid.addRow("Urin","12.07.16","positiv");
		laborGrid.addRow("Kokain","29.08.16","negativ");
		
//		gotGptGgt = new Grid();
//		gotGptGgt.addColumn("GOT", String.class);
//		gotGptGgt.addColumn("GPT", String.class);
//		gotGptGgt.addColumn("GGT", String.class);
		
		diagnoseLaborLayout.addComponents(diagnoseTitle, diagnoseGrid, laborTitle, laborGrid);
		
		adminDiagnoseLaborLayout.addComponents(adminPanel, diagnoseLaborLayout);
		
		mediLabel = new Label("Medikationsübersicht");
		
		mediGrid = new Grid();
		mediGrid.setWidth("100%");
		mediGrid.addColumn("Medikament", String.class);
		mediGrid.addColumn("Pharmacode", String.class);
		mediGrid.addColumn("Dosis", String.class);
		mediGrid.addColumn("Compendium", String.class);
		mediGrid.addColumn("Bereit", String.class);
		mediGrid.addColumn("Applikationsform", String.class);
		mediGrid.addColumn("Einahme", String.class);
		mediGrid.addColumn("Datum", String.class);
		mediGrid.addColumn("Bemerkung", String.class);
		mediGrid.setSizeFull();
		
		mediGrid.addRow("RITALIN LA 40mg", "2510998","40-60mg tgl.","Link","","Tablette","oral","27.10.16","3 mal täglich");
		//mediPanel.setContent(mediGrid);
		
		footerLayout = new HorizontalLayout();
		problemButton = new Button("Probleme");
		footerLayout.setSpacing(true);
		lastSynchro = new Label("letzte Synchronisation: 123");
		synchroButton = new Button("Synchronisieren");
		
		footerLayout.addComponents(problemButton, lastSynchro, synchroButton);

		addComponents(titleLayout, adminDiagnoseLaborLayout,mediLabel,mediGrid, footerLayout );
	}
	
}
