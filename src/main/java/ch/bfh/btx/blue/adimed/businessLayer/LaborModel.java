package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Observable;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;

public class LaborModel extends Observable {

	private ArrayList<LaborResult> labResults;
	private JPAConnection conn;

	public ArrayList<LaborResult> getLabResults() {
		return labResults;
	}

	public LaborModel() {
		labResults = new ArrayList<LaborResult>();
		conn = new JPAConnection();
	}

	public void loadData() {
		labResults = new ArrayList<LaborResult>(conn.labResults());

		setChanged();
		notifyObservers();
	}
}
