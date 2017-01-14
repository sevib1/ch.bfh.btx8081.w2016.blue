package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class PatientCase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientCaseId;

	@OneToMany(mappedBy = "patientCase")
	private ArrayList<LaborResult> laborResult; // Association
	@OneToMany(mappedBy = "patientCase")
	private ArrayList<Medication> medication; // Association
	@OneToMany(mappedBy = "patientCase")
	private ArrayList<Diagnosis> diagnosis; // Association

	@OneToOne(mappedBy="patientCase")
	private Patient patient;
	
	public PatientCase() {
		
	}

	public int getPatientCaseId() {
		return patientCaseId;
	}

	public ArrayList<LaborResult> getLaborResult() {
		return laborResult;
	}

	public ArrayList<Medication> getMedication() {
		return medication;
	}

	public ArrayList<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public Patient getPatient() {
		return patient;
	}


}
