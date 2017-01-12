package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.Date;

//import java.sql.Date;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="medication")
public class Medication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Date applyDate;

	private String medName;

	private String medDosis;

	private String medStatus;

	private String applyForm;

	private String comment;

	public Medication() {
	}

	public Date getApplyDate() {

		return applyDate;
	}

	public String getMedName() {
		return medName;
	}

	public String getMedDosis() {
		return medDosis;
	}

	public String getMedStatus() {
		return medStatus;
	}

	public String getApplyForm() {
		return applyForm;
	}

	public String getComment() {
		return comment;
	}

}
