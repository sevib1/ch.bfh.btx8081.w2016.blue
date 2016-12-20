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
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private GregorianCalendar laborDate;
	private String typeOfExamination;
	private boolean results;
	
	@OneToMany
	private List<Case> cases;
	
	public LaborResult() {
		
	}
	
public LaborResult(GregorianCalendar laborDate, String typeOfExamination, boolean results, List<Case> cases) {
		this.laborDate = laborDate;
		this.typeOfExamination = typeOfExamination;
		this.results = results;
		this.cases = cases;
	}
	
	public String getLabor() {
		return "ersetzen";
	}

}
