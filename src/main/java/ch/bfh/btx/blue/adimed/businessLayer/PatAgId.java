package ch.bfh.btx.blue.adimed.businessLayer;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Id;

public class PatAgId implements Serializable{

	
	private int PID;
	
	private Date agendaDate;

public PatAgId(){
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + PID;
	result = prime * result + ((agendaDate == null) ? 0 : agendaDate.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PatAgId other = (PatAgId) obj;
	if (PID != other.PID)
		return false;
	if (agendaDate == null) {
		if (other.agendaDate != null)
			return false;
	} else if (!agendaDate.equals(other.agendaDate))
		return false;
	return true;
}


}
