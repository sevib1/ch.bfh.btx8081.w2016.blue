package ch.bfh.btx.blue.adimed.web;


import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
public class MainPage extends UI {
	public Navigator navigator;

	// All views
	public static final String PATIENTSCHEDULE = "schedule";
	public static final String DASHBOARD = "dashboard";
	public static final String MEDIVIEW = "medi";
	public static final String LABORVIEW = "laborView";

	@Override
	protected void init(VaadinRequest request) {
		//final VerticalLayout layout = new VerticalLayout();

		final VerticalLayout layout = new Dashboard();

		

		layout.setMargin(true);
		layout.setSpacing(true);

		setContent(layout);
		ComponentContainerViewDisplay viewDisplay = new ComponentContainerViewDisplay(layout);
		navigator = new Navigator(UI.getCurrent(), viewDisplay);
		navigator.addView("", new Dashboard());
		navigator.addView(PATIENTSCHEDULE, new PatientenSchedule());
		navigator.addView(DASHBOARD, new Dashboard());
		navigator.addView(LABORVIEW, new LaborView());
		navigator.addView(MEDIVIEW, new MediView());
//		navigator.addView("", new Patienten_Schedule());
//		navigator.addView(DASHBOARD, new Dashboard());

	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MainPage.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
