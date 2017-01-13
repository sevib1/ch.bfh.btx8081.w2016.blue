package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.List;

import javax.persistence.OneToMany;

public class Staff {
	

	private String eMail;
	private String userName;
	private String passWord;
	private String firstName;
	private String name;
	private String phoneNb;
	
	@OneToMany
	private List<Medication> medications;

	public Staff() {

	}

	public String getServiceProviders() {
		return "ersetzen";
	}

}
