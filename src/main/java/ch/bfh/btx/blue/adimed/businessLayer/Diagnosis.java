package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Diagnosis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private GregorianCalendar diagnosisDate;
	private String status;
	private String diagnosis;
	
	@OneToOne
	private Case cas;
	
	public Diagnosis() {
		
	}
	
	public Diagnosis(GregorianCalendar diagnosisDate, String status, String diagnosis) {
		this.diagnosisDate = diagnosisDate;
		this.status = status;
		this.diagnosis = diagnosis;
	}
	
	
	public String getDiagnosis() {
		return "ersetzen";
	}

}
