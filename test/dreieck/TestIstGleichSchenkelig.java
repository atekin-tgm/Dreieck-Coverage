package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

/* 	Testklasse zu Dreieck.java
 * 	@author		Abdurrahim Burak TEKIN 
 * 	@version	13.04.2016
 */

public class TestIstGleichSchenkelig {
	
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istEinDreieckAberNichtGleichSchenkelig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istAgleichSchenkeligB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istAgleichSchenkeligC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istBgleichSchenkeligC() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void sindAlleSeitenGleichSchenkelig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void nichtGleichSchenkelig() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
}