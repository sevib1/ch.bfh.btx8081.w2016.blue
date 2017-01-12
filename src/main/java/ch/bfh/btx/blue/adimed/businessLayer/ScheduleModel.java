package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.Observable;

import ch.bfh.btx.blue.adimed.dataLayer.JPAConnection;
import javafx.scene.control.CheckBox;

public class ScheduleModel extends Observable {
	
	private ArrayList<Patient> patient;
	private JPAConnection conn;
	
	public ArrayList<Patient> getPatient() {
		return patient;
	}

	 public ScheduleModel(){
	  patient = new ArrayList<Patient>();
	  conn = new JPAConnection();
	 }
	public void loadData() {
	//	patient = new ArrayList<Patient>(conn.patient());

		setChanged();
		notifyObservers();
	}

}
