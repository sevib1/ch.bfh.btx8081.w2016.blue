package ch.bfh.btx.blue.adimed.businessLayer;


public class Staff extends Person {

	private String email;

	public Staff() {

	}

	public Staff(String email) {
		this.email = email;

	}
	public String getServiceProviders() {
		return "ersetzen";
	}

}
