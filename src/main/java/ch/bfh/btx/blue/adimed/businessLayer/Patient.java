package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Entity
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Patient extends Person {
	private int pId;
	private String firstName;
	private String name;
	private String street;
	private int postalCode;
	private String city;
	private GregorianCalendar birthDate;
	private String phoneNb;
	private char gender;
	
	private int cId;
	private String insurance;
	private String insuranceNb;
	private String allergies;

//	@OneToOne
//	private Case cas;
	

	public Patient() {

	}
	
	public Patient(int personID, String firstName, String name, String street, int postalCode, String city,
			GregorianCalendar birthDate, String phoneNb, char gender, String insurance, String insuranceNb,
			String allergies, Case cas) {
		super(personID, firstName, name, street, postalCode, city, birthDate, phoneNb, gender);
		this.insurance = insurance;
		this.insuranceNb = insuranceNb;
		this.allergies = allergies;
		//this.cas = cas;

	}

	

	public String getPatient() {
		return "ersetzen";
	}

}
