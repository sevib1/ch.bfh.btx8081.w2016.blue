package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

@Entity
@IdClass(PatAgId.class)
public class Agenda {
	
	@Id
	private int PID;
	@Id
	private Date agendaDate;
	private boolean appeared;

	@OneToMany
	private List<Case> cases; // Association

	
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
