package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

public class Diagnosis {
	
	private GregorianCalendar diagnosisDate;
	private String status;
	private String diagnosis;
	
	public Diagnosis() {
		
	}
	
	public Diagnosis(GregorianCalendar diagnosisDate, String status, String diagnosis) {
		this.diagnosisDate = diagnosisDate;
		this.status = status;
		this.diagnosis = diagnosis;
	}
	
	
	public String getDiagnosis() {
		return "ersetzen";
	}

}
