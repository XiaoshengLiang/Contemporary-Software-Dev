
public interface AlarmClock {
  
  public void set_time(int hrs, int mins, int secs);
  
  public void set_alarm_time(Person person, int hrs, int mins, int secs);
  
  public void tick(Person person) ;
  
  public String get_time();
  
  public boolean alarm_reached(Person person);
 
}

