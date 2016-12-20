package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
@Entity public class Case {
@Id
	private int CID;
	private GregorianCalendar diagnoseDate;
	private GregorianCalendar applyDate;
	private GregorianCalendar laborDate;
	private GregorianCalendar agendaDate;
	@OneToOne
	private Patient patient; // Association
	@OneToMany
	private List<LaborResult> laborResult; // Association
	@OneToMany
	private List<Medication> medication; // Association
	@OneToMany
	private List<Diagnosis> diagnosis; // Association

	public Case() {
	}

	public void getCase() {
	}

}
