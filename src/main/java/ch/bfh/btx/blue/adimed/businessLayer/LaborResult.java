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

}
