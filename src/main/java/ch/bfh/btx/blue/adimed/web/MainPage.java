package ch.bfh.btx.blue.adimed.web;

import javax.servlet.annotation.WebServlet;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx.blue.adimed.businessLayer.DashboardModel;
import ch.bfh.btx.blue.adimed.businessLayer.LaborModel;
import ch.bfh.btx.blue.adimed.businessLayer.MediModel;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@SuppressWarnings("serial")
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

		DashboardModel dbm = new DashboardModel();
		final VerticalLayout layout = new PatientenSchedule(dbm);

		// set the main layout
		layout.setMargin(true);
		layout.setSpacing(true);
		setContent(layout);
		//ComponentContainerViewDisplay viewDisplay = new ComponentContainerViewDisplay(layout);

		MediModel mm = new MediModel();
		LaborModel lm = new LaborModel();
		
		// create the Navigator for all Views
		navigator = new Navigator(this,this);
		navigator.addView("", (View)layout);
		navigator.addView(PATIENTSCHEDULE, (View)layout);
		navigator.addView(DASHBOARD, new Dashboard(dbm, mm, lm));
		navigator.addView(LABORVIEW, new LaborView(lm));
		navigator.addView(MEDIVIEW, new MediView(mm));

	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MainPage.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
