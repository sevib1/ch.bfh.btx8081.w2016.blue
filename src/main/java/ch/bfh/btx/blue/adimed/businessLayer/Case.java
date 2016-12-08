package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.List;

public class Case {

	private int caseID;
	
	private List<Patient> patient; // Association
	private List<LaborResult> laborResult; // Association
	private List<Medication> medication; // Association
	private List<Diagnosis> diagnosis; // Association

	public Case() {
	}

	public void getCase() {
	}

}
