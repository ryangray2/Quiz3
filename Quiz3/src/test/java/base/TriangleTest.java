package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void PerimeterTest() {
		Triangle t = new Triangle(3, 4, 5);
		double result = t.getPerimeter();
		assertEquals(12, result, 0);
	}
	
	@Test
	public void AreaTest() {
		Triangle t = new Triangle(3, 4, 5);
		double result = t.getArea();
		assertEquals(6, result, 0);
	}

}

