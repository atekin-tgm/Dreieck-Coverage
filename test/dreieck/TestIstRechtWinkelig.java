package dreieck;

import static org.junit.Assert.*;
import org.junit.*;

/* 	Testklasse zu Dreieck.java
 * 	@author		Abdurrahim Burak TEKIN 
 * 	@version	13.04.2016
 */

public class TestIstRechtWinkelig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istAgroesserBundAgroesserC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istBgroesserAundBgroesserC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istCgroesserAundCgroesserB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istBgroesserCundCgroesserA() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test 
	public void rechtWinkeligundCgroesserAlsAundB() { 
		dreieck.setSeite_a(3); 
		dreieck.setSeite_b(3); 
		dreieck.setSeite_c(4); 
 		 
		assertFalse(this.dreieck.rechtWinkelig()); 
	} 
	
	@Test 
	public void rechtWinkeligundAgroesserAlsBundC() { 
		dreieck.setSeite_a(4); 
		dreieck.setSeite_b(3); 
		dreieck.setSeite_c(3); 
 		 
		assertFalse(this.dreieck.rechtWinkelig()); 
	} 
	
	@Test 
	public void rechtWinkeligundBgroesserAlsAundC() { 
		dreieck.setSeite_a(3); 
		dreieck.setSeite_b(4); 
		dreieck.setSeite_c(3); 
 		 
		assertFalse(this.dreieck.rechtWinkelig()); 
	}
	
	@Test 
	public void rechtWinkeligUndDreieck() { 
		dreieck.setSeite_a(3); 
		dreieck.setSeite_b(3); 
		dreieck.setSeite_c(3); 
 		 
		assertFalse(this.dreieck.rechtWinkelig()); 
	}
}