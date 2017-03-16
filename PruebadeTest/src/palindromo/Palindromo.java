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
				
		result=frase+reves;//se cambia la variable resultado por result, mirar el test por si hay fallos
		
		sc.close();
		
		return result;
		
	}
	
}
	

