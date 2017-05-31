
public class SubPerson implements Person{
	
	
	public SubPerson(String a_name){
	    name = a_name;
	  }
	  
	  public void go_to_bed(){
	    System.out.println(name + " is going to bed...");
	  }
	  
	  public void wake_up(){
	    System.out.println(name + " has woken up!");
	  }
	  
	  private String name;
}
