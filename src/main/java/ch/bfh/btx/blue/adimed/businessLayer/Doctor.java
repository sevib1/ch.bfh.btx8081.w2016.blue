package ch.bfh.btx.blue.adimed.businessLayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

//@DiscriminatorValue("Doctor")
public class Doctor/* extends Staff */{
	@Id
	private int id;
	private String title;
	private String specialization;

	public Doctor() {

	}

	public Doctor(String title, String specialization) {
		this.setTitle(title);
		this.setSpecialization(specialization);

	}

	public String getDoctor() {
		return "ersetzen";
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
