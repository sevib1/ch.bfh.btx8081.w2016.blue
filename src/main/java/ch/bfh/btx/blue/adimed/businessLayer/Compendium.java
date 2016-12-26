package ch.bfh.btx.blue.adimed.businessLayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compendium {
	@Id
	private int ID;
	private String compendium;

	public Compendium() {

	}

	public Compendium(String compendium) {
		this.compendium = compendium;
	}

	public String getCompendium() {
		return compendium;
	}

}
