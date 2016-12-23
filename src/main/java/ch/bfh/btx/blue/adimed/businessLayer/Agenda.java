package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@IdClass(PatAgId.class)
public class Agenda {
	
	@Id
	private int PID;
	@Id
	private Date agendaDate;
	private boolean appeared;

//	@OneToMany
//	private List<Case> cases; // Association

	
	public Agenda() {
	}
/**
 * @return - 
 */
public String toString(){
	return PID +" "+agendaDate+" "+appeared;
}
 
	public void getAppointement() {
	}

}
