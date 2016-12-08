package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;

public class Patient extends Person {

	private String insurance;
	private int insuranceNr;
	
	private String allergies;

	public Patient() {

	}
	
	public Patient (String insurance, int insuranceNr, String allergies) {
		this.insurance = insurance;
		this.insuranceNr = insuranceNr;
		this.allergies = allergies;
	}

	

	public String getPatient() {
		return "ersetzen";
	}

}
