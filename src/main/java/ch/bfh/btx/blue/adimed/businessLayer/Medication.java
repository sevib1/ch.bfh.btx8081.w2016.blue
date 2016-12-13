package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

public class Medication {

	private GregorianCalendar dateOfgivenMedical;
	private String mediName;
	private String mediDosis;
	private boolean mediState;
	private String applicationForm;
	private String takingForm;
	private String comment;
	
	private Compendium compendium; // Association
	private List<Staff> Staffs; // Association

	public Medication() {

	}

	public Medication(GregorianCalendar dateOfgivenMedical, String mediName, String mediDosis, boolean mediState,
			Compendium compendium, String applicationForm, String takingForm, String comment) {
		this.dateOfgivenMedical = dateOfgivenMedical;
		this.mediName = mediName;
		this.mediDosis = mediDosis;
		this.mediState = mediState;
		this.compendium = compendium;
		this.applicationForm = applicationForm;
		this.takingForm = takingForm;
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
