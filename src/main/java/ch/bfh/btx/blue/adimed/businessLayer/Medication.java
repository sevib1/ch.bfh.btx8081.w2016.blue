package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;
 
import javax.persistence.Id;
import javax.persistence.Entity;




@Entity @IdClass(MedicationId.class)
public class Medication {
	
	@Id
	private int CID;	
	@Id
	private int applyDate;
		
	private String medName;
	
	private String medDosis;
	
	private String medStatus;
	
	private String applyForm;
	
	private String comment;	
	
	

	private Compendium compendium; // Association
	private List<Staff> Staff; // Association

	
	private List<Staff> ServiceProviders; // Association
	private List<Staff> Staffs; // Association

	public Medication() {

	}

	public Medication(GregorianCalendar dateOfgivenMedical, String mediName, String mediDosis, boolean mediState,
			Compendium compendium, String applicationForm, String takingForm, String comment) {
		this.applyDate = applyDate;
		this.medName = medName;
		this.medDosis = medDosis;
		this.medStatus = medStatus;
		this.compendium = compendium;
		this.applyForm = applicationForm;
		//this.takingForm = takingForm;
		this.comment = comment;

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
