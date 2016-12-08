package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Time;
import java.util.GregorianCalendar;
import java.util.List;

public class Agenda {
	private GregorianCalendar date;
	private Time time;
	private boolean appeared;
	
	private List<Case> Case; // Association

	public Agenda() {
	}

	public Agenda(GregorianCalendar d, Time t, boolean a) {
		date = d;
		time = t;
		appeared = a;
	}

	public void getAppointement() {
	}

}
