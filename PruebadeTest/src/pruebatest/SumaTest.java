package pruebatest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void testSuma() {
		
		Suma operacion = new Suma(5, 10);
		int resultado=operacion.suma();
		assertTrue (resultado == 15);
		
	}
	
	@Test
	public void testresta(){
		
		Suma operacion = new Suma(2, 24);
		int resultado=operacion.resta();
		assertFalse (resultado == -21);
		
	}

}
