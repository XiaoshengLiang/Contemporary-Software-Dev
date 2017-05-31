import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangle {

//	tests for Equilateral
	@Test
	public void testIfEquilateral() {
		Triangle t = new Triangle(2,2,2);
		assertEquals("all sides same length, it an equilateral","equilateral", t.typeOf());
	}

//	test for Isosceles
	@Test
	public void testIfIsosceles_0() {
		Triangle t = new Triangle(2,2,3);
		assertEquals("two sides same length, it an isosceles","isosceles", t.typeOf());
	}
	
	@Test
	public void testIfIsosceles_1() {
		Triangle t = new Triangle(3,2,2);
		assertEquals("two sides same length, it an isosceles","isosceles", t.typeOf());
	}
	
	@Test
	public void testIfIsosceles_2() {
		Triangle t = new Triangle(2,3,2);
		assertEquals("two sides same length, it an isosceles","isosceles", t.typeOf());
	}
	
//	tests for Scalene
	@Test
	public void testIfScalene_0() {
		Triangle t = new Triangle(2,3,4);
		assertEquals("all sides unequal length, it a scalene","scalene", t.typeOf());
	}
	
	@Test
	public void testIfScalene_1() {
		Triangle t = new Triangle(2,4,3);
		assertEquals("all sides unequal length, it a scalene","scalene", t.typeOf());
	}
	
	@Test
	public void testIfScalene_2() {
		Triangle t = new Triangle(4,3,2);
		assertEquals("all sides unequal length, it a scalene","scalene", t.typeOf());
	}
	
//	tests for invalid
	@Test
	public void testIfInvalid_0() {
		Triangle t = new Triangle(0,0,0);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_1() {
		Triangle t = new Triangle(-2,-2,-2);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_2() {
		Triangle t = new Triangle(0,2,3);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_3() {
		Triangle t = new Triangle(2,3,0);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_4() {
		Triangle t = new Triangle(2,0,3);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_5() {
		Triangle t = new Triangle(1,3,5);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}

	@Test
	public void testIfInvalid_6() {
		Triangle t = new Triangle(3,5,1);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_7() {
		Triangle t = new Triangle(5,1,3);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
	
	@Test
	public void testIfInvalid_8() {
		Triangle t = new Triangle(1,2,3);
		assertEquals("not a valid triangle, it an invalid","invalid", t.typeOf());
	}
}
