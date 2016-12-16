package ch.bfh.btx.blue.adimed.web;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class MediView extends VerticalLayout implements View{
	HorizontalLayout gridTitelLayout;
	HorizontalLayout mediGridLayout;
	Button backButton;
	Label mediLabel;
	Grid mediGrid;
	
	
	public  MediView() {
		
		gridTitelLayout = new HorizontalLayout();
		mediLabel = new Label("Medikationsübersicht");
		gridTitelLayout.setMargin(true);
		gridTitelLayout.setSpacing(true);
		
		
		
		
		
		mediGridLayout = new HorizontalLayout();
		mediGridLayout.setWidth("100%");
		mediGrid = new Grid();
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
		
		backButton = new Button("", new Button.ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				 getUI().getNavigator().navigateTo(MainPage.DASHBOARD);
				
			}
		});
		backButton.setIcon(new ClassResource("/back.png"));
		backButton.setHeight("170%");
		
		gridTitelLayout.addComponents(mediLabel,backButton);
		mediGridLayout.addComponent(mediGrid);
	
		
		mediGrid.addRow("RITALIN LA 40mg", "2510998","40-60mg tgl.","Link","","Tablette","oral","27.10.16","3 mal täglich");
		
		addComponents(gridTitelLayout,mediGridLayout);
}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	} 

}
