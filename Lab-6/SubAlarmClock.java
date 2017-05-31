import java.util.ArrayList;
import java.util.List;

public class SubAlarmClock implements AlarmClock{

	//	list of observers
	private List<Person> personlist = new ArrayList<Person>();
	
	public SubAlarmClock(){
	    hours=0; minutes=0; seconds=0;
	    alarm_hours=0; alarm_minutes=0; alarm_seconds=0;
	  }
	  
	  public void set_time(int hrs, int mins, int secs){
	    hours=hrs; minutes=mins; seconds=secs;
	  }


	  public void set_alarm_time(Person person, int hrs, int mins, int secs){
	    alarm_hours=hrs; alarm_minutes=mins; alarm_seconds=secs;
	    personlist.add(person);
	    person.go_to_bed();
	  }

	  public void tick(Person person) {
	    if ((seconds += 1) == 60) {
	      seconds = 0;
	      if ((minutes += 1) == 60) {
	        minutes = 0;
	        if ((hours += 1) == 24) {
	          hours = 0;
	        }
	      }
	    }
	  }
	  
	  public String get_time(){
	    return Integer.toString(hours)+":"+Integer.toString(minutes)+":"+Integer.toString(seconds);
	  }
		@Override
	  public boolean alarm_reached(Person person){
		  personlist.remove(person);
		  person.wake_up();
		  return (hours==alarm_hours&&minutes==alarm_minutes&&seconds==alarm_seconds);
	  }
	  
	  private int hours, minutes, seconds;
	  private int alarm_hours, alarm_minutes, alarm_seconds;

}
