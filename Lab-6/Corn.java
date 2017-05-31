
public class Corn implements Person {
	public Corn(String a_name){
	    name = a_name;
	  }
	  
	  public void go_to_bed(){
	    System.out.println(name + " is going to bed...(Corn)");
	  }
	  
	  public void wake_up(){
	    System.out.println(name + " has woken up(Corn)!");
	  }
	  
	  private String name;
}
