package ch.bfh.btx.blue.adimed.businessLayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor extends Staff {

	private int pID;
	private String title;
	private String specialization;

	public Doctor() {

	}

	public Doctor(String title, String specialization) {
		this.title = title;
		this.specialization = specialization;

	}

	public String getDoctor() {
		return "ersetzen";
	}

}
