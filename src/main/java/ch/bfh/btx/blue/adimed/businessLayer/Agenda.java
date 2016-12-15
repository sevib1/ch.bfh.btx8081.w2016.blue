package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CID;
	private GregorianCalendar agendaDate;
	private boolean appeared;

	private List<Case> Case; // Association

	public Agenda() {
	}

	public Agenda(GregorianCalendar agendaDate, int CID, boolean apeared) {
		this.agendaDate = agendaDate;
		this.CID = CID;
		this.appeared = appeared;
	}

	public void getAppointement() {
	}

}
