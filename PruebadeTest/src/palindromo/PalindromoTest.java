package palindromo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromoTest {

	@Test
	public void testVacio() {
		String frase ="";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals(""));
	}

	@Test
	public void testEspacioInicio() {
		String frase =" Opera";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals(" OperaarepO "));
		
	}
	
	@Test
	public void testEspacioFinal() {
		String frase ="Alien ";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals("Alien  neilA"));
		
	}
	
	@Test
	public void testUnaLetra() {
		String frase ="Y";
		String palind=Palindromo.verPalindromo(frase);
		assertFalse(palind.equals("YH"));//con assertFalse para asegurar que el resultado es falso
		
	}
	
	@Test
	public void testTresLetras() {
		String frase="Ira";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals("IraarI"));
	}
	
	@Test
	public void testSieteLetras() {
		String frase ="Tamaran";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals("TamarannaramaT"));
		
	}
	
	@Test
	public void testDiezLetras() {
		String frase="Licantropo";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals("LicantropooportnaciL"));
		
	}
	
	@Test
	public void testMayusculas(){
		String frase="NOSTROMO";
		String palind=Palindromo.verPalindromo(frase);
		assertTrue(palind.equals("NOSTROMOOMORTSON"));
		
	}
	
	
	
	
	
}
