package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="appointment")

public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date agendaDate;

	public Appointment() {
	}

	public void getAppointement() {
	}

}
