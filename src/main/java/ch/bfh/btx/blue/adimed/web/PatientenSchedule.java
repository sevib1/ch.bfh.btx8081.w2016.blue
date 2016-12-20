package ch.bfh.btx.blue.adimed.web;

import java.util.Date;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

/*
 * The Patient Schedule displays all the appointment of the day 
 * 
 * @created: Patrick Jolo
 * 
 * 
 */
@Theme("mytheme")
public class PatientenSchedule extends VerticalLayout implements View {

	HorizontalLayout TitleLayout;
	Label title;
	DateField date;
	Button logout;
	VerticalLayout scheduleLayout;
	Grid scheduleGrid;
	HorizontalLayout BottomLayout;
	Button problems;
	Label synchronisierung;
	Button Sync;
	VerticalLayout allBox;

	public PatientenSchedule() {
		// Title
		TitleLayout = new HorizontalLayout();
		title = new Label("Patienten Schedule");

		date = new DateField();
		date.setValue(new Date());
		date.setDateFormat("dd.MM.yyyy");

		logout = new Button("Logout", new Button.ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				 getUI().getNavigator().navigateTo(MainPage.DASHBOARD);
				
			}
		});
		
		TitleLayout.addComponent(title);
		TitleLayout.addComponent(date);

		TitleLayout.addComponent(logout);
		TitleLayout.setMargin(true);
		TitleLayout.setSpacing(true);

		// Schedule
		scheduleLayout = new VerticalLayout();
		scheduleGrid = new Grid();
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
		BottomLayout = new HorizontalLayout();
		problems = new Button("Probleme");
		synchronisierung = new Label("letzte Synchronisierung: ");
		Sync = new Button("Synchronisieren");

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
		allBox = new VerticalLayout();
		allBox.addComponent(TitleLayout);
		allBox.addComponent(scheduleLayout);
		allBox.addComponent(BottomLayout);
		addComponent(allBox);

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	// @Override
	// public void enter(ViewChangeEvent event) {
	// // TODO Auto-generated method stub
	//
	// }

}