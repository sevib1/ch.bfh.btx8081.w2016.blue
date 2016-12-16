package ch.bfh.btx.blue.adimed.web;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class LaborView extends VerticalLayout implements View{
	
	HorizontalLayout laborLayout;
	VerticalLayout labGridLayout;
	Label laborTitle;
	Grid laborGrid;
	Button backButton;
	

	
	public LaborView(){
		laborLayout = new HorizontalLayout();
		laborTitle = new Label("Laborresultate");
		laborLayout.setMargin(true);
		laborLayout.setSpacing(true);
		
		labGridLayout = new VerticalLayout();
		laborGrid = new Grid();
		laborGrid.addColumn("Untersuchungsart", String.class);
		laborGrid.addColumn("Datum", String.class);
		laborGrid.addColumn("Resultat", String.class);
		
		backButton = new Button("", new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				 getUI().getNavigator().navigateTo(MainPage.DASHBOARD);
				
			}
		});
		backButton.setIcon(new ClassResource("/back.png"));
		backButton.setHeight("170%");
		
		laborLayout.addComponents(laborTitle,backButton);
		labGridLayout.addComponent(laborGrid);
		
		laborGrid.addRow("Urin","12.07.16","positiv");
		laborGrid.addRow("Kokain","29.08.16","negativ");
		
		

		addComponents(laborLayout,labGridLayout);
			
		
	}

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
