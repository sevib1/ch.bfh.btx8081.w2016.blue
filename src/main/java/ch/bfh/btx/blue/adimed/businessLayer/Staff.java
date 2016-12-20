package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Staff extends Person {
	
	private int pID;

	private String email;
	
	private String eMail;
	
	private String userName;
	
	private String passWord;
	
	@OneToMany
	private List<Medication> medications;

	public Staff() {

	}

	public Staff(String email) {
		this.email = email;

	}
	public String getServiceProviders() {
		return "ersetzen";
	}

}
