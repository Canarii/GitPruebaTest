package palindromo;

import java.util.Scanner;

public class Palindromo {

	public static String verPalindromo (String frase){
		
		String reves ="";
		String resultado ="";
		
		Scanner sc = new Scanner (System.in);
		
		int size=frase.length();
		
		for (int i=size-1; i>=0; i--)
			
		reves = reves +frase.charAt(i);
				
		resultado=frase+reves;
		
		sc.close();
		
		return resultado;
		
	}
	
}
	
