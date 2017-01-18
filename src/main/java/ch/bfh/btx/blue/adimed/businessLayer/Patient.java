package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Patient {

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

	private String insurance;
	private String insuranceNb;
	private String allergy;

	@OneToOne
	private PatientCase patientCase;

	// @OneToMany(mappedBy = "patient")
	// private List<Appointment> appointment = new ArrayList<Appointment>();

	public Patient() {

	}

	public int getPID() {
		return PID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public int getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getPhoneNb() {
		return phoneNb;
	}

	public char getSex() {
		return sex;
	}

	public String getInsurance() {
		return insurance;
	}

	public String getInsuranceNb() {
		return insuranceNb;
	}

	public String getAllergy() {
		return allergy;
	}

	public PatientCase getPatientCase() {
		return patientCase;
	}

	public Patient getPatient() {
		return this;
	}

}
