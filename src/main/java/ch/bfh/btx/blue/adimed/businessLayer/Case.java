package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Entity;
@Entity public class Case {
@Id
	private int CID;
	private GregorianCalendar diagnoseDate;
	private GregorianCalendar applyDate;
	private GregorianCalendar laborDate;
	private GregorianCalendar agendaDate;
	private Patient patient; // Association
	private List<LaborResult> laborResult; // Association
	private List<Medication> medication; // Association
	private List<Diagnosis> diagnosis; // Association

	public Case() {
	}

	public void getCase() {
	}

}
