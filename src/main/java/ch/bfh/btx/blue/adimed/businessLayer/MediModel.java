package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Observable;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;

public class MediModel extends Observable {
	
	private PatientCase patientCase;
	private JPAConnection conn;
	
	public ArrayList<Medication> getMedication() {
		return patientCase.getMedication();
	}
	
	public MediModel(){
		conn = new JPAConnection();
	}
	public void loadData(){
		patientCase = conn.getPatientCaseById(patientCase.getPatientCaseId());
		
		setChanged();
		notifyObservers();
	}

	public void setPatientCase(PatientCase patientCase) {
		this.patientCase = patientCase;
		
	}

	
}


