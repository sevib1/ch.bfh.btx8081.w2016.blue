package ch.bfh.btx.blue.adimed.businessLayer;

import java.util.ArrayList;
import java.util.Observable;

import javafx.scene.control.CheckBox;

public class ScheduleModel extends Observable {
	private ArrayList<Schedule> schedule;
	public ArrayList<Schedule> getSchedule(){
		return schedule;
	}
	
	public ScheduleModel(){
		schedule = new ArrayList<Schedule>();
	}
	public void loadData(){
		schedule.clear();
		//schedule.add(new Schedule(1,"1234","Hallo");
		
		setChanged();
		notifyObservers();
	}

}
//scheduleTable.addContainerProperty("Versicherugsnummer", String.class, null);
//scheduleTable.addContainerProperty("Name", String.class, null);
//scheduleTable.addContainerProperty("Vorname", String.class, null);
//scheduleTable.addContainerProperty("Geburtsdatum", String.class, null);
//scheduleTable.addContainerProperty("Geschlecht", String.class, null);
//scheduleTable.addContainerProperty("Termin", String.class, null);
//scheduleTable.addContainerProperty("erscheinen", CheckBox.class, null);