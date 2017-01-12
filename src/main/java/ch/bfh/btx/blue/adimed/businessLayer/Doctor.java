package ch.bfh.btx.blue.adimed.businessLayer;

import javax.persistence.Entity;
import javax.persistence.Id;

//@DiscriminatorValue("Doctor")
public class Doctor/* extends Staff */ {

	private int id;
	private String title;
	private String specialization;

	public Doctor() {

	}

	public String getDoctor() {
		return "ersetzen";
	}

	public String getSpecialization() {
		return specialization;
	}

	public String getTitle() {
		return title;
	}

}
