package ch.bfh.btx.blue.adimed.businessLayer;

import java.sql.Time;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private GregorianCalendar datum; 
	private Time zeit; 
	private boolean appeared = true;
	
	public Agenda(){}
	
	public void getTermin() {
	}

}
