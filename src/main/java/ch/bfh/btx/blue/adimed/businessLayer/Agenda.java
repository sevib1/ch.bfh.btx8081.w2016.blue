package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CID;
	private GregorianCalendar agendaDate;
	private boolean appeared;
	
	@OneToMany
	private List<Case> cases; // Association

	public Agenda() {
	}

	public Agenda(GregorianCalendar agendaDate, int CID, boolean apeared, List<Case> cases) {
		this.agendaDate = agendaDate;
		this.CID = CID;
		this.appeared = appeared;
		this.cases = cases;
	}

	public void getAppointement() {
	}

}
