package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity

public class Staff extends Person {
	
	private int PID;

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

//	public Staff(String firstName, String name, String phoneNb, String eMail, int pId) {
//		super(firstName,name, phoneNb);
//		this.eMail = eMail;
//		this.pId = pId;
//	}
	public String getServiceProviders() {
		return "ersetzen";
	}

}
