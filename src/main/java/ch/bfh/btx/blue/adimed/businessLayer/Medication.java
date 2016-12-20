package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
 
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Entity 
//@IdClass(MedicationId.class)
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
	
	

	private Compendium compendium; // Association
	@OneToOne
	private Case cas;
	@ManyToOne
	private Staff staff; // Association

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
