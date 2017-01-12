package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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

	public void getCase() {
	}

}
