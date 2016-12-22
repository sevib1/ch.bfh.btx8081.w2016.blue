package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.Observable;

public class DashboardModel extends Observable {

	private ArrayList<Diagnosis> diaResults;
	private ArrayList<Patient> patient;

	public ArrayList<Diagnosis> getDiaResults() {
		return diaResults;
	}

	public DashboardModel() {
		diaResults = new ArrayList<Diagnosis>();
		patient = new ArrayList<Patient>();
	}

	public void loadData() {
		diaResults.clear();
//		patient.clear();
//		diaResults.add(null);
//
//		patient.add(null);

		setChanged();
		notifyObservers();
	}

}
