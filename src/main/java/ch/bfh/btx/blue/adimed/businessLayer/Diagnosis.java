package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

public class Diagnosis {
	
	private GregorianCalendar diagnosisDate;
	private String status;
	private String diagnosis;
	
	public Diagnosis() {
		
	}
	
	public Diagnosis(GregorianCalendar d, String s, String a) {
		diagnosisDate = d;
		status = s;
		diagnosis = a;
	}
	
	
	public void getDiagnose() {
	}

}
