
public class AlarmApplication {

  public static void main(String[] args) {
	SubAlarmClock alarm_clock = new SubAlarmClock();

    SubPerson jack = new SubPerson("Jack");
    SubPerson Anna = new SubPerson("Anna");
    SubPerson Michael = new SubPerson("Michael");
    Corn mary = new Corn("mary");
    alarm_clock.set_alarm_time(jack, 2, 1, 2);
    alarm_clock.set_alarm_time(Anna, 3, 5, 7);
    alarm_clock.set_alarm_time(Michael, 4, 9, 0);
    alarm_clock.set_alarm_time(mary, 6, 4, 1);
    
    for (int i=1; i<=SECONDS_IN_DAY; i++){
      alarm_clock.tick(jack);
      alarm_clock.tick(Anna);
      alarm_clock.tick(Michael);
      if (alarm_clock.alarm_reached(jack)){
    	 System.out.println("The time is: " + alarm_clock.get_time());  
      }   	 
      if (alarm_clock.alarm_reached(Anna)){
     	 System.out.println("The time is: " + alarm_clock.get_time());
       }
      if (alarm_clock.alarm_reached(Michael)){
     	 System.out.println("The time is: " + alarm_clock.get_time());   
       }
    }
  }
  
  public static final int SECONDS_IN_DAY = 86400;
}