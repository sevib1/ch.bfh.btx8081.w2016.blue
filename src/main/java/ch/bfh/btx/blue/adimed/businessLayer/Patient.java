package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;

@Entity

public class Patient{
	

	@Id
	private int PID;
	
	private String firstName;
	private String name;
	private String street;
	private int zip;
	private String city;
	private Date birthDate;
	private String phoneNb;
	private char sex;
	private int cId;
	private String insurance;
	private String insuranceNb;
	private String allergy;

//	@OneToOne
//	private Case cas;
	
//@OneToOne


	public Patient() {
	
	}
	
//	public Patient(int personID, String firstName, String name, String street, int postalCode, String city,
//			GregorianCalendar birthDate, String phoneNb, char gender, String insurance, String insuranceNb,
//			String allergies, Case cas) {
//		super(personID, firstName, name, street, postalCode, city, birthDate, phoneNb, gender);
//		this.insurance = insurance;
//		this.insuranceNb = insuranceNb;
//		this.allergies = allergies;
		//this.cas = cas;

//	}

	
//public String toString(){
//	return name;
//}-
	public int getPatient() {
		return PID;
	}

}
