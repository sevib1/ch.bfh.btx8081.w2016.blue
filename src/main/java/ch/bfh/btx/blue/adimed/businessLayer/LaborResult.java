package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LaborResult {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private GregorianCalendar laborDate;
	private String typeOfExamination;
	private boolean results;
	
	public LaborResult() {
		
	}
	
public LaborResult(GregorianCalendar laborDate, String typeOfExamination, boolean results) {
		this.laborDate = laborDate;
		this.typeOfExamination = typeOfExamination;
		this.results = results;
		
	}
	
	public String getLabor() {
		return "ersetzen";
	}

}
