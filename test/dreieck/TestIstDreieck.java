package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

/* 	Testklasse zu Dreieck.java
 * 	@author		Abdurrahim Burak TEKIN 
 * 	@version	13.04.2016
 */

public class TestIstDreieck {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckSeiteANull() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.istDreieck());
	}
	
	
	@Test
	public void istDreieckSeiteAKleinerNull() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(-1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istAplusBgleichC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istAplusCgleichB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istBplusCgleichA() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istAplusBkleinerNull() {
		dreieck.setSeite_a(Integer.MAX_VALUE -1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istAplusCkleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(Integer.MAX_VALUE -1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istBplusCkleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(Integer.MAX_VALUE -1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istAplusBkleinerC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istAplusCkleinerB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istBplusCkleinerA() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertTrue(dreieck.istDreieck());
	}
	
	
}