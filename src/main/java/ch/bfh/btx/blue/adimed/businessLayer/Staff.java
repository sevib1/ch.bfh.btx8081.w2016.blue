package ch.bfh.btx.blue.adimed.businessLayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff extends Person {
	@Id
	private int pID;

	private String email;
	
	private String eMail;
	
	private String userName;
	
	private String passWord;

	public Staff() {

	}

	public Staff(String email) {
		this.email = email;

	}
	public String getServiceProviders() {
		return "ersetzen";
	}

}
