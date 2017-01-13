package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class PatientCase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientCaseId;

	@OneToMany(mappedBy = "patientCase")
	private List<LaborResult> laborResult; // Association
	@OneToMany(mappedBy = "patientCase")
	private List<Medication> medication; // Association
	@OneToMany(mappedBy = "patientCase")
	private List<Diagnosis> diagnosis; // Association

	public PatientCase() {
	}

	public int getPatientCaseId() {
		return patientCaseId;
	}

	public List<LaborResult> getLaborResult() {
		return laborResult;
	}

	public List<Medication> getMedication() {
		return medication;
	}

	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}


}
