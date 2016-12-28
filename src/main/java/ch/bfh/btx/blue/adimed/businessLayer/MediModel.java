package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Observable;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;

public class MediModel extends Observable {
	
	private ArrayList<Medication> medication;
	private JPAConnection conn;
	
	public ArrayList<Medication> getMedication() {
		return medication;
	}
	
	public MediModel(){
		medication = new ArrayList<Medication>();
		conn = new JPAConnection();
	}
	public void loadData(){
		medication = new ArrayList<Medication>(conn.medication());
		

		
		
		setChanged();
		notifyObservers();
	}

	
}


