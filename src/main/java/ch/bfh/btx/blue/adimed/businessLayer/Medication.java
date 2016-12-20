package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Entity 
public class Medication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int CID;	
	private int applyDate;
		
	private String medName;
	
	private String medDosis;
	
	private String medStatus;
	
	private String applyForm;
	
	private String comment;	
	
	//@OneToOne
	private Compendium compendium; // Association
	
	@OneToMany
	private List<Case> cases;
	
	@ManyToOne
	private Staff staff; // Association

	
	public Medication() {
	}

	public Medication(GregorianCalendar dateOfgivenMedical, String mediName, String mediDosis, boolean mediState,
			Compendium compendium, String applicationForm, String takingForm, String comment, List<Case> cases, Staff staff) {
		this.applyDate = applyDate;
		this.medName = medName;
		this.medDosis = medDosis;
		this.medStatus = medStatus;
		this.compendium = compendium;
		this.applyForm = applicationForm;
		//this.takingForm = takingForm;
		this.comment = comment;
		this.cases = cases;
		this.staff = staff;

	}

	public void getMedication() {
	}

	public boolean getMediStateReady() {
		return true;
	}

	public boolean getMedicineTaken() {
		return true;
	}

	public void setMediStateReady(boolean set) {

	}

	public void setMediTaken(boolean set) {

	}
}
