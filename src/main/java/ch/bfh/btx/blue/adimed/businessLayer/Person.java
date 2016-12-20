package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity public class Person {
	@Id
	private int pID;
	
	private String firstName;
	private String name;
	private String street;
	private int postalCode;
	private String city;
	private GregorianCalendar birthDate;
	private int phoneNb;
	private char gender;

	public Person() {

	}

	public Person(int personID, String firstName, String name, String street, int postalCode, String city,
			GregorianCalendar birthDate, int phoneNb, char gender) {
		this.pID = personID;
		this.firstName = firstName;
		this.name = name;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.birthDate = birthDate;
		this.phoneNb = phoneNb;
		this.gender = gender;
	}

	public Person(String firstName, String name, int phoneNb) {
		this.firstName = firstName;
		this.name = name;
		this.phoneNb = phoneNb;
	}

	public String getPerson() {
		return "ersetzen";

	}
}
