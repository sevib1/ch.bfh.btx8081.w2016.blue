package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
@Entity 

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Person {
	
	@Id
	private int pID;
	
	private String firstName;
	private String name;
	private String street;
	private int zip;
	private String city;
	private GregorianCalendar birthDate;
	private String phoneNb;
	private char sex;

	public Person() {

	}

	public Person(int personID, String firstName, String name, String street, int postalCode, String city,
			GregorianCalendar birthDate, String phoneNb, char gender) {
		this.pID = personID;
		this.firstName = firstName;
		this.name = name;
		this.street = street;
		this.zip = postalCode;
		this.city = city;
		this.birthDate = birthDate;
		this.phoneNb = phoneNb;
		this.sex = gender;
	}

	public Person(String firstName, String name, String phoneNb) {
		this.firstName = firstName;
		this.name = name;
		this.phoneNb = phoneNb;
	}

	public String getPerson() {
		
		
		return "ersetzen";

	}
	
	public String toString(){
		return firstName + " "+ name;
		
	}
}
