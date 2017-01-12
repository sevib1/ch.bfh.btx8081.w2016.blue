package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;

@Entity

public class Patient{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PID;
	
	private String firstName;
	private String name;
	private String street;
	private int zip;
	private String city;
	private Date birthDate;
	private String phoneNb;
	private char sex;
	private int CID;
	private String insurance;
	private String insuranceNb;
	private String allergy;
	
	

@OneToOne(CascadeType.PERSIST)
	private Case cas;

	public Patient() {
	
	}
	
		
	public int getPatient() {
		return PID;
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNb() {
		return phoneNb;
	}

	public void setPhoneNb(String phoneNb) {
		this.phoneNb = phoneNb;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getcId() {
		return CID;
	}

	public void setcId(int cId) {
		this.CID = cId;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getInsuranceNb() {
		return insuranceNb;
	}

	public void setInsuranceNb(String insuranceNb) {
		this.insuranceNb = insuranceNb;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

}
