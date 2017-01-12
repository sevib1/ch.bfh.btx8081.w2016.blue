package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity 
@Table(name="case")
public class Case {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	

	
	
	@OneToMany
	@JoinColumn(name="labR")
	private List<LaborResult> laborResult; // Association
	@OneToMany
	@JoinColumn(name="med")
	private List<Medication> medication; // Association
	@OneToMany
	@JoinColumn(name="diag")
	private List<Diagnosis> diagnosis; // Association

	public Case() {
	}

	public void getCase() {
	}

}
