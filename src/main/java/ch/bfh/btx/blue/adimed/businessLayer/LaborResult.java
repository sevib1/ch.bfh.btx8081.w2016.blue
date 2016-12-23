package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LaborResult {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int LabId;

	public int getLabId() {
		return LabId;
	}

	public void setLabId(int labId) {
		LabId = labId;
	}

	public List<Case> getCases() {
		return cases;
	}

	public void setCases(List<Case> cases) {
		this.cases = cases;
	}

	private GregorianCalendar laborDate;
	private String typeOfExamination;
	private boolean results;

	@OneToMany
	private List<Case> cases;

	public LaborResult() {

	}

	public LaborResult(int Id, GregorianCalendar laborDate, String typeOfExamination, boolean results,
			List<Case> cases) {
		this.LabId = Id;
		this.setLaborDate(laborDate);
		this.setTypeOfExamination(typeOfExamination);
		this.setResults(results);
		this.cases = cases;
	}

	public String getLabor() {
		return "ersetzen";
	}

	public GregorianCalendar getLaborDate() {
		return laborDate;
	}

	public void setLaborDate(GregorianCalendar laborDate) {
		this.laborDate = laborDate;
	}

	public String getTypeOfExamination() {
		return typeOfExamination;
	}

	public void setTypeOfExamination(String typeOfExamination) {
		this.typeOfExamination = typeOfExamination;
	}

	public boolean isResults() {
		return results;
	}

	public void setResults(boolean results) {
		this.results = results;
	}

}
