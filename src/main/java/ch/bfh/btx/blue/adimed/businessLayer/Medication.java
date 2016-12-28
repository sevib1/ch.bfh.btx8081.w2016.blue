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
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int CID;
	
	private GregorianCalendar applyDate;

	private String medName;

	private String medDosis;

	private String medStatus;

	private String applyForm;

	private String comment;

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public GregorianCalendar getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(GregorianCalendar dateOfgivenMedical) {
		this.applyDate = dateOfgivenMedical;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getMedDosis() {
		return medDosis;
	}

	public void setMedDosis(String medDosis) {
		this.medDosis = medDosis;
	}

	public String getMedStatus() {
		return medStatus;
	}

	public void setMedStatus(String medStatus) {
		this.medStatus = medStatus;
	}

	public String getApplyForm() {
		return applyForm;
	}

	public void setApplyForm(String applyForm) {
		this.applyForm = applyForm;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

//	public Compendium getCompendium() {
//		return compendium;
//	}
//
//	public void setCompendium(Compendium compendium) {
//		this.compendium = compendium;
//	}

	public List<Case> getCases() {
		return cases;
	}

	public void setCases(List<Case> cases) {
		this.cases = cases;
	}

	// @OneToOne
	//private Compendium compendium; // Association

	@OneToMany
	private List<Case> cases;

	// @ManyToOne
	// private Staff staff; // Association

	public Medication() {
	}

	public Medication(int Id,GregorianCalendar dateOfgivenMedical, String mediName, String mediDosis, boolean mediState,
			Compendium compendium, String applicationForm, String takingForm, String comment,
			List<Case> cases/* , Staff staff */) {
		this.CID = Id;
		this.applyDate = applyDate;
		this.medName = medName;
		this.medDosis = medDosis;
		this.medStatus = medStatus;
		//this.compendium = compendium;
		this.applyForm = applicationForm;
		// this.takingForm = takingForm;
		this.comment = comment;
		this.cases = cases;
		// this.staff = staff;
		this.setApplyDate(dateOfgivenMedical);

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
