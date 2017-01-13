package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
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
	private GregorianCalendar diagnosisDate;
	private String status;
	private String diagnosis;

	public Diagnosis() {

	}

	public GregorianCalendar getDiagnosisDate() {
		return diagnosisDate;
	}

	public String getStatus() {
		return status;
	}

	public String getDiagnosis() {
		return "ersetzen";
	}

	public PatientCase getPatientCase() {
		return patientCase;
	}

	public void setPatientCase(PatientCase patientCase) {
		this.patientCase = patientCase;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
