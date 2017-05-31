
public class OCP{
	public static void main(String[] args) {
		Square square = new Square(10.0);
		PostageStamp stamp_square = new PostageStamp(square);
		System.out.println(stamp_square.toString());
		
		Triangle triangle = new Triangle(11.0);
		PostageStamp stamp_triangle = new PostageStamp(triangle);
		System.out.println(stamp_triangle.toString());
	}
}

class PostageStamp{
	public PostageStamp(Shape shape){
		this.shape = shape;
	}
	public String toString(){
		return "stamp, contained in a " + shape.toString();
	}
	private Shape shape; 
}

interface Shape{
	public void noticeShape(double d);
	public String toString();
}

class Square implements Shape{
	public Square(double d){
		_length = d;
	}
	public String toString(){
		return "square, side of length " + _length;
	}
	
	@Override
	public void noticeShape(double d) {
		_length = d;	
	}
	private double _length;
}

class Triangle implements Shape{
	public Triangle(double d){
		_length = d;
	}
	public String toString(){
		return "triangle, side of length " + _length;
	}
	
	public void noticeShape(double d) {
		_length = d;	
	}
	private double _length;
	
}
