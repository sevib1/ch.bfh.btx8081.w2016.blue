package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Patient extends Person {

	
	private int pId;
	private String firstName;
	private String name;
	private String street;
	private int postalCode;
	private String city;
	private GregorianCalendar birthDate;
	private int phoneNb;
	private char gender;
	
	private int cId;
	private String insurance;
	private int insuranceNb;
	private String allergies;
	@OneToOne
	private Case cas;
	

	public Patient() {

	}
	
	public Patient(int personID, String firstName, String name, String street, int postalCode, String city,
			GregorianCalendar birthDate, int phoneNb, char gender, String insurance, int insuranceNb,
			String allergies, Case cas) {
		super(personID, firstName, name, street, postalCode, city, birthDate, phoneNb, gender);
		this.insurance = insurance;
		this.insuranceNb = insuranceNb;
		this.allergies = allergies;
		this.cas = cas;

	}

	

	public String getPatient() {
		return "ersetzen";
	}

}
