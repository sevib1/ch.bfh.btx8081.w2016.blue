package ch.bfh.btx.blue.adimed.businessLayer;

public class Doctor extends ServiceProviders {

	private String title;
	private String specialization;

	public Doctor() {

	}

	public Doctor(String title, String specialization) {
		this.title = title;
		this.specialization = specialization;

	}

	public String getDoctor() {
		return "ersetzen";
	}

}
