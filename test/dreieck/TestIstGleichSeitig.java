package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

/* 	Testklasse zu Dreieck.java
 * 	@author		Abdurrahim Burak TEKIN 
 * 	@version	13.04.2016
 */

public class TestIstGleichSeitig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void sindAlleSeitenGleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.gleichSeitig());
	}
	
	@Test
	public void nurAundBgleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void nurAundCgleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void nurBundCgleich() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void keineSeitenGleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSeitig());
	}
}