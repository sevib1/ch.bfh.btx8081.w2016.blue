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
	Panel mediPanel;
	Grid mediGrid;
	HorizontalLayout footerLayout;
	Button problemButton;
	Label lastSynchro;
	Button synchroButton;
	FormLayout adminForm;
	TextField patIDField;
	
	public Dashboard(){
		titleLayout = new HorizontalLayout();
		titleLabel = new Label("PatientenDashboard");
		backButton = new Button("Zurück zur Patientenübersicht");

		titleLayout.addComponent(titleLabel);
		titleLayout.addComponent(backButton);
		
		adminDiagnoseLaborLayout = new HorizontalLayout();
		adminPanel = new Panel("Stamm- und Bewegungsdaten");
		adminForm = new FormLayout();
		patIDField = new TextField("Patienten-ID");
		patIDField.setEnabled(false);
		patIDField.setValue("12345678");
		patIDField = new TextField("Name:");
		patIDField.setEnabled(false);
		patIDField.setValue("Panzerotti");
		patIDField = new TextField("Vorname:");
		patIDField.setEnabled(false);
		patIDField.setValue("Marco");
		
		adminForm.addComponents(patIDField);
		adminPanel.setContent(adminForm);
		
		diagnoseLaborLayout = new VerticalLayout();
		diagnoseTitle = new Label("Diagnosen");
		diagnoseGrid = new Grid();
		diagnoseGrid.addColumn("Status", String.class);
		diagnoseGrid.addColumn("Diagnose", String.class);
		diagnoseGrid.addColumn("Datum", String.class);
		
		diagnoseGrid.addRow("Status nach:" , "Alkoholabhängigkeit", "1.1.17");
		diagnoseGrid.addRow("Verdacht auf:" , "Leberzyrrhose", "1.1.16");
		
		
		laborTitle = new Label("Laborresultate");
		laborGrid = new Grid();
		
		diagnoseLaborLayout.addComponents(diagnoseTitle, diagnoseGrid, laborTitle, laborGrid);
		
		adminDiagnoseLaborLayout.addComponents(adminPanel, diagnoseLaborLayout);
		
		mediPanel = new Panel("Medikamente");
		mediGrid = new Grid();
		
		mediPanel.setContent(mediGrid);
		
		footerLayout = new HorizontalLayout();
		problemButton = new Button("Probleme");
		lastSynchro = new Label("letzte Synchronisation: 123");
		synchroButton = new Button("Synchronisieren");
		
		footerLayout.addComponents(problemButton, lastSynchro, synchroButton);

		addComponents(titleLayout, adminDiagnoseLaborLayout, mediPanel, footerLayout );
	}
	
}
