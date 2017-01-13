package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointementId;
	private Date agendaDate;
	@ManyToOne
	private Patient patient;
	
	public Appointment() {
	}

	public Date getAgendaDate() {
		return agendaDate;
	}

	public void setAgendaDate(Date agendaDate) {
		this.agendaDate = agendaDate;
	}


}
