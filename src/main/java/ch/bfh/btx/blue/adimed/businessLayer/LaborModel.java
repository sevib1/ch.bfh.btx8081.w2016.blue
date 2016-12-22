package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;

public class LaborModel extends Observable {
	
	private ArrayList<LaborResult> labResults;
	public ArrayList<LaborResult> getLabResults() {
		return labResults;
	}
	
	public LaborModel(){
		labResults = new ArrayList<LaborResult>();
	}
	public void loadData(){
		labResults.clear();
		labResults.add(new LaborResult(1, new GregorianCalendar(), "GOT", true, new ArrayList<Case>()));
		labResults.add(new LaborResult(2, new GregorianCalendar(), "GPT", true, new ArrayList<Case>()));
		
		labResults.add(new LaborResult(3, new GregorianCalendar(), "GGT", true, new ArrayList<Case>()));

		labResults.add(new LaborResult(4, new GregorianCalendar(), "Panc", true, new ArrayList<Case>()));

		labResults.add(new LaborResult(5, new GregorianCalendar(), "Quick", true, new ArrayList<Case>()));

		labResults.add(new LaborResult(7, new GregorianCalendar(), "INR", true, new ArrayList<Case>()));

		labResults.add(new LaborResult(8, new GregorianCalendar(), "Crea", true, new ArrayList<Case>()));
		
		setChanged();
		notifyObservers();
	}
}
