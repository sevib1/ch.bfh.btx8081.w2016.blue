package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Patient extends Person {

	
	private int pId;
	private int cId;
	private String insurance;
	private int insuranceNb;
	private String allergies;
	@OneToOne
	private Case cas;

	public Patient() {

	}
	
	public Patient (String insurance, int insuranceNb, String allergies, Case cas) {
		this.insurance = insurance;
		this.insuranceNb = insuranceNb;
		this.allergies = allergies;
		this.cas = cas;
	}

	

	public String getPatient() {
		return "ersetzen";
	}

}
