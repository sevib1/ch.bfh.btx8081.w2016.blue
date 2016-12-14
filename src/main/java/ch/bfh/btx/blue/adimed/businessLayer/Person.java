package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity public class Person {
	@Id
	private int pID;
	
	private String firstName;
	private String Name;
	private String street;
	private int postalCode;
	private String city;
	private GregorianCalendar birthDate;
	private int phoneNb;
	private char gender;

	public Person() {

	}

	public Person(int personID, String firstName, String lastName, String street, int postalCode, String city,
			GregorianCalendar birthDate, int phoneNb, char gender) {
		this.pID = personID;
		this.firstName = firstName;
		this.Name = Name;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.birthDate = birthDate;
		this.phoneNb = phoneNb;
		this.gender = gender;
	}

	public String getPerson() {
		return "ersetzen";

	}
}
