package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

public class LaborResult {
	
	private GregorianCalendar laborDate;
	private String typeOfExamination;
	private boolean results;
	
	public LaborResult() {
		
	}
	
public LaborResult(GregorianCalendar laborDate, String typeOfExamination, boolean results) {
		this.laborDate = laborDate;
		this.typeOfExamination = typeOfExamination;
		this.results = results;
		
	}
	
	public String getLabor() {
		return "ersetzen";
	}

}
