package de.akad.jav01;

import java.util.Arrays;
import java.util.Random;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--> Aufgabe 1");
		
		int[] array = {1, 2, 3, 4, 5};
		int max=0,min=0;
		boolean firstrun = true;
		
		for (int i: array) {

			if (firstrun) {
				max = i;
				min = i;
				firstrun = false;
			}
		
			if (i>max) max = i;
			if (i<min) min = i;
			
						
		}
		
		System.out.println("Der kleinste: " + min);
		System.out.println("Der groeste: " + max);
	
		
		System.out.println("--> Aufgabe 2");
		
		String[] wort = { "fort", "alle", "fliegen", "amseln" };
		Arrays.sort(wort);
		
		for (String s: wort) {
			System.out.println(s);
		}
		
		
		System.out.println("--> Aufgabe 3");

		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = new int[10];
		
		System.arraycopy(array1, 0, array2, 0, array1.length);
	
		System.out.println("gibt nix zum glotzen ;-)");

		
		System.out.println("--> Aufgabe 4");

		
		int[] erg = new int[3];
		Random rand = new Random();
		erg[0] = rand.nextInt(6) + 1;
		erg[1] = rand.nextInt(6) + 1;
		erg[2] = rand.nextInt(6) + 1;
		int sum = erg[0] + erg[1] + erg[2];
	
		System.out.println("Summe von " + erg[0] + " " + erg[1] + " " + erg[2] + " lautet: " + sum);
			

		System.out.println("--> Aufgabe 5");
		Namen namen = new Namen();
		int [] blub = {0, 1 , 3}; // Mapped A B C 
		namen.zeichenAusgeben(blub);
		
		// Aufgabe 6 offen
		
		
	}

}
