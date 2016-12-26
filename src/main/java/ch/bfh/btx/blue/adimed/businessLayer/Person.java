package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import java.util.GregorianCalendar;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity 
@Inheritance( strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "personType", discriminatorType = DiscriminatorType.INTEGER)

public class Person {
	
	@Id
	private int PID;
	private String personType;
	private String firstName;
	private String name;
	private String street;
	private int zip;
	private String city;
	private Date birthDate;
	private String phoneNb;
	private char sex;

	public Person() {

	}

//	public Person(int personID, String firstName, String name, String street, int postalCode, String city,
//			GregorianCalendar birthDate, String phoneNb, char gender) {
//		this.pID = personID;
//		this.firstName = firstName;
//		this.name = name;
//		this.street = street;
//		this.zip = postalCode;
//		this.city = city;
//		this.birthDate = birthDate;
//		this.phoneNb = phoneNb;
//		this.sex = gender;
//	}

//	public Person(String firstName, String name, String phoneNb) {
//		this.firstName = firstName;
//		this.name = name;
//		this.phoneNb = phoneNb;
//	}

	public String getPerson() {
		
		
		return "ersetzen";

	}
	
	public String toString(){
		return firstName + " "+ name+" "+street;
		
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}
}
