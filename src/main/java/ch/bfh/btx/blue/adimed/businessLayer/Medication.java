package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.Date;

//import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Medication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int medicationId;
	@ManyToOne
	private PatientCase patientCase;
	private Date applyDate;
	private String medName;
	private String medDosis;
	private String medStatus;
	private String applyForm;
	private String comment;

	public Medication() {
		
	}

	public int getMedicationId() {
		return medicationId;
	}

	public PatientCase getPatientCase() {
		return patientCase;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public String getMedName() {
		return medName;
	}

	public String getMedDosis() {
		return medDosis;
	}

	public String getMedStatus() {
		return medStatus;
	}

	public String getApplyForm() {
		return applyForm;
	}

	public String getComment() {
		return comment;
	}

}
