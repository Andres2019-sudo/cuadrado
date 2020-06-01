package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {

	private Square square;
	
	@Before
	public void before() {
		this.square= new Square(5);
	}
	@Test
	public void testcalculateArea() {
		assertEquals(25, square.calculateArea(), 0.10);
	}

}
