package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.Observable;

import javafx.scene.control.CheckBox;

public class ScheduleModel extends Observable {
	private ArrayList<Schedule> schedule;
	public ArrayList<Schedule> getSchedule() {
		return schedule;
	}

	// public ScheduleModel(){
	// schedule = new ArrayList<Schedule>();
	// }
	public void loadData() {
		schedule.clear();
		// schedule.add(new
		// Schedule(1,"123","123","123","123","123","123","123",new
		// ArrayList<Patient>()));

		setChanged();
		notifyObservers();
	}

}
