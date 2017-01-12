package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LaborResult {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resultId;
	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	@ManyToOne
	private PatientCase patientCase;
	private GregorianCalendar laborDate;
	private String typeOfExamination;
	private boolean results;

	public LaborResult() {

	}

	public String getLabor() {
		return "ersetzen";
	}

	public GregorianCalendar getLaborDate() {
		return laborDate;
	}

	public String getTypeOfExamination() {
		return typeOfExamination;
	}

	public boolean isResults() {
		return results;
	}

	public PatientCase getPatientCase() {
		return patientCase;
	}

	public void setPatientCase(PatientCase patientCase) {
		this.patientCase = patientCase;
	}

}
