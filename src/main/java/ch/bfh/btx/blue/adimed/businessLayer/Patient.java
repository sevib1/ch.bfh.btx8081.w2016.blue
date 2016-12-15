package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient extends Person {

	@Id
	private int pId;
	private int cId;
	private String insurance;
	private int insuranceNb;
	private String allergies;

	public Patient() {

	}
	
	public Patient (String insurance, int insuranceNb, String allergies) {
		this.insurance = insurance;
		this.insuranceNb = insuranceNb;
		this.allergies = allergies;
	}

	

	public String getPatient() {
		return "ersetzen";
	}

}
