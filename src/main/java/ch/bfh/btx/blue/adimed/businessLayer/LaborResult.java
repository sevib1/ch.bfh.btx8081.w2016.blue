package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LaborResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resultId;
	
	@ManyToOne
	private PatientCase patientCase;
	private Date laborDate;
	private String typeOfExamination;
	private boolean results;
	
	public LaborResult() {

	}

	public int getResultId() {
		return resultId;
	}

	public String getLabor() {
		return "ersetzen";
	}

	public Date getLaborDate() {
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

}
