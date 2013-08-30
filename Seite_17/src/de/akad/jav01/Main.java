package de.akad.jav01;

public class Main {

	private static final String Datum = null;
	private static int i = 1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		next();
		
		String s2 = "hallo";
		String s3 = new String("hallo");
		
		if (s2.equals(s3)) System.out.println("gleich");
		else System.out.println("ungleich");
		
		if (s2.compareTo(s3) == 0) System.out.println("gleich");
		else System.out.println("ungleich");
		
		
		next();
		
		String s4 = "maria ciriello";
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(6));
		System.out.println(s4.substring(6));
		
		
		next();
		
		String s5 = "Sonnenblumenwiese";
		System.out.println(s5.length());
	
		
		next();

		String datum = "28.8.1749";
		String[] datum_s = datum.split("\\.");
				
		int tag = Integer.parseInt(datum_s[0]);
		int monat = Integer.parseInt(datum_s[1]);
		int jahr = Integer.parseInt(datum_s[2]);
		
		Datum datum_o = new Datum(tag, monat, jahr);

		System.out.println(datum_o.toString());


		next();

		String chines = "Drei Chinesen mit dem Kontrabass";
		char[] chines_c = chines.toCharArray();
		char[] match = "aeiou".toCharArray();
		
		int i = 0, j;

		
		while (i < chines_c.length) {
			
			j = 0;
			
			while(j < match.length) {


				if (chines_c[i] == match[j]) chines_c[i] = 'e'; 
				j++;	
			}
			
			i++;
		}
		System.out.println(chines_c);
		
		
		next();

		String ziffern = "2468097531";
		int[] ziffern_i = new int[ziffern.length()];
		char[] ziffern_c = ziffern.toCharArray();
		
		i=0;
		
		for (char c: ziffern_c) {
			ziffern_i[i++] = Character.digit(c, 10);
		}
		
		for (int i1: ziffern_i) {
		
			System.out.print(i1);
		}
	
		System.out.println();

		
		next();

		// Todo
		
		
	}
	
	private static void next() {
		
		System.out.println("--> Aufgabe: " + i++);
		
	}

	
}
