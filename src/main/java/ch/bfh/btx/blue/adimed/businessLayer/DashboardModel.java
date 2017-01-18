package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.Observable;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;

public class DashboardModel extends Observable {

	private ArrayList<Diagnosis> diagnosis;
	private Patient patient;

	JPAConnection conn;

	public ArrayList<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public DashboardModel() {
		diagnosis = new ArrayList<Diagnosis>();
		conn = new JPAConnection();
	}

	public void loadData() {
		patient = conn.getPatientById(patient.getPID());
		diagnosis = patient.getPatientCase().getDiagnosis();
		setChanged();
		notifyObservers();
	}

	public void setSelectedPatient(Patient patient) {
		this.patient = patient;
	}

	public Patient getPatient() {
		return patient;
	}

}
