package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diagnosis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int diagnosisId;

	private PatientCase patientCase;
	private Date diagnosisDate;
	private String status;
	private String diagnosis;

	public Diagnosis() {

	}

	public Date getDiagnosisDate() {
		return diagnosisDate;
	}

	public String getStatus() {
		return status;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public PatientCase getPatientCase() {
		return patientCase;
	}

}
