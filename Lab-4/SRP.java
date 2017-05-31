
public class SRP {
	public static void main(String[] args) {
		Walker walker = new Walker("Dog Walker Group");
		walker.throwStick();
		
		Place place = new Place("Killiney");
		place.stay();
		
		Time time = new Time(12.12);
		time.showTime();
		
		Hexapod hexapod = new Hexapod();
		hexapod.walk();
		hexapod.fetchStick();
		hexapod.bark();
	}
}

class Hexapod{
	public void fetchStick(){
		System.out.println("I'm fetching a stick");
	}

	public void walk(){
		System.out.println("I'm walking");
	}

	public void bark(){
		System.out.println("Woof! ");
	}
	
}

class Walker{
	public Walker(String name){
		_name = name;
	}
	
	public void throwStick(){
		System.out.println(_name + "is throwing a stick");
	}
	
	private String _name;	
}

class Place{
	public Place(String place_name){
		 _place_name = place_name;
	}
	
	public void stay(){
		System.out.println("Now, i am in " + _place_name);
	}
	
	private String _place_name;
	
}

class Time{
	public Time(Double time){
		_time = time;
	}
	public void showTime(){
		System.out.println("It's " + _time);
	}
	
	private double _time;
}