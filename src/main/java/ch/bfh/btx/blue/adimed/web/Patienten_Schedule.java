package ch.bfh.btx.blue.adimed.web;

import java.util.Date;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/*
 * The Patient Schedule displays all the appointment of the day 
 * 
 * @created: Patrick Jolo
 * 
 * 
 */
@Theme("mytheme")
public class Patienten_Schedule extends VerticalLayout {
	
	HorizontalLayout TitleLayout;
	Label title;
	DateField date;
	Button logout;
	VerticalLayout scheduleLayout;
	Grid scheduleGrid ;
	HorizontalLayout BottomLayout;
	Button problems;
	Label synchronisierung;
	Button Sync;
	VerticalLayout allBox;
	
	
	

	public Patienten_Schedule() {
		// Title
		HorizontalLayout TitleLabel = new HorizontalLayout();
		Label title = new Label("Patienten Schedule");
		

		DateField date = new DateField();
		date.setValue(new Date());
		date.setDateFormat("dd.MM.yyyy");

		Button logout = new Button("Logout");
		TitleLabel.addComponent(title);
		TitleLabel.addComponent(date);

		TitleLabel.addComponent(logout);
		TitleLabel.setMargin(true);
		TitleLabel.setSpacing(true);

		// Schedule
		VerticalLayout scheduleLayout = new VerticalLayout();
		Grid scheduleGrid = new Grid();
		scheduleGrid.addColumn("Versicherungsnummer", String.class);
		scheduleGrid.addColumn("Name", String.class);
		scheduleGrid.addColumn("Vorname", String.class);
		scheduleGrid.addColumn("Geschlecht", String.class);
		scheduleGrid.addColumn("Geburtsdatum", String.class);
		scheduleGrid.addColumn("Termin", String.class);
		scheduleGrid.addColumn("erscheinen", String.class);
		scheduleGrid.addColumn("Details", String.class);
		
		scheduleGrid.addRow("834734667", "Panzoretti", "Marco", "23.08.1944", "m", "Freitag", "", "Details");
		scheduleGrid.addRow("834787401", "Hugentobler", "Franziska", "12.2.1969", "w", "Freitag", "", "Details");

		scheduleLayout.setMargin(true);
		scheduleGrid.setSizeFull();
		scheduleLayout.addComponent(scheduleGrid);

		// Bottom
		HorizontalLayout BottomLayout = new HorizontalLayout();
		Button problems = new Button("Probleme");
		Label synchronisierung = new Label("letzte Synchronisierung: ");
		Button Sync = new Button("Synchronisieren");

		BottomLayout.addComponent(problems);
		BottomLayout.setComponentAlignment(problems, Alignment.BOTTOM_LEFT);
		problems.setSizeFull();
		BottomLayout.addComponent(synchronisierung);
		BottomLayout.setComponentAlignment(synchronisierung, Alignment.BOTTOM_CENTER);
		synchronisierung.setSizeFull();
		BottomLayout.addComponents(Sync);
		BottomLayout.setComponentAlignment(Sync, Alignment.BOTTOM_RIGHT);
		BottomLayout.setMargin(true);
		BottomLayout.setSpacing(true);

		// Alle Layout zusammen
		VerticalLayout allBox = new VerticalLayout();
		allBox.addComponent(TitleLabel);
		allBox.addComponent(scheduleLayout);
		allBox.addComponent(BottomLayout);

	}

}
