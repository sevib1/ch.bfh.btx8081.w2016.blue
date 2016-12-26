package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Observable;

public class MediModel extends Observable {
	
	private ArrayList<Medication> medication;
	public ArrayList<Medication> getMedication() {
		return medication;
	}
	
	public MediModel(){
		medication = new ArrayList<Medication>();
	}
	public void loadData(){
		medication.clear();
		//medication.add(new Medication());
		

		
		
		setChanged();
		notifyObservers();
	}

	
}


