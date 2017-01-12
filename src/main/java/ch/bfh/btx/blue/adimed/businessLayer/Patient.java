package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.persistence.internal.jpa.metadata.structures.ArrayAccessor;

@Entity
@Table(name="patient")
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
	
	private String insurance;
	private String insuranceNb;
	private String allergy;
	
	

@OneToOne
@JoinColumn(name="patientcase")
	private PatientCase cas;
	
@OneToMany
@JoinColumn(name="appointment")
private List<Appointment>appointment = new ArrayList<Appointment>();

	public Patient() {
	
	}
	
		
	public int getPatient() {
		return PID;
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

	

}
