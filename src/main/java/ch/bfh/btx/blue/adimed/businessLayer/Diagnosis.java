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
public class Diagnosis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private GregorianCalendar diagnosisDate;
	private String status;
	private String diagnosis;
	
	@OneToMany
	private List<Case> cases;
	
	public Diagnosis() {
		
	}
	
	public Diagnosis(GregorianCalendar diagnosisDate, String status, String diagnosis, List<Case> cases) {
		this.diagnosisDate = diagnosisDate;
		this.status = status;
		this.diagnosis = diagnosis;
		this.cases = cases;
	}
	
	
	public String getDiagnosis() {
		return "ersetzen";
	}

}
