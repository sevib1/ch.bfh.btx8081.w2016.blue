package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="diagnosis")
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

}
