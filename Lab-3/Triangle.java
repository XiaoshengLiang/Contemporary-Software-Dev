
public class Triangle {
	public int slide_a;
	public int slide_b;
	public int slide_c;
	
	public Triangle(int a,int b,int c){
		slide_a = a;
		slide_b = b;
		slide_c = c;
	}
	
	public String typeOf(){
		
		boolean abc = slide_a + slide_b > slide_c;
		boolean acb = slide_a + slide_c > slide_b;
		boolean bca = slide_b + slide_c > slide_a;
		
		boolean ca = slide_c >= slide_a;
		boolean cb = slide_c >= slide_b;
		boolean ba = slide_b >= slide_a;
		boolean bc = slide_b >= slide_c;
		boolean ab = slide_a >= slide_b;
		boolean ac = slide_a >= slide_c;
		
		if(slide_a<=0 ||slide_b<=0 ||slide_c<=0){
			return "invalid";
		}		
		if((abc && ca && cb) || (acb && ba && bc) || (bca && ab && ac)){		
			if(slide_a == slide_b || slide_b == slide_c || slide_c == slide_a){
				if(slide_a == slide_b && slide_b == slide_c){
				return "equilateral";
				}
				return "isosceles";
			}
			return "scalene";
		}		 
		return "invalid";
	}
}
	
	