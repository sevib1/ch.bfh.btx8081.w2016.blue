package ch.bfh.btx.blue.adimed.businessLayer;

public class Doctor/* extends Staff */ {

	private int doctorId;
	private String title;
	private String specialization;

	public Doctor() {

	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
