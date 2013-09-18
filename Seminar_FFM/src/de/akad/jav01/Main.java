package de.akad.jav01;

public class Main {

	static int nr = 1;
	
	public static void main(String[] args) {

		printTrenner();
		
		int a = 7;
		
		System.out.println((a == 0) ? "Ja" : "Nein");


		printTrenner();
		
		Cubus c = new Cubus();
		
		c.setBreite(2);
		c.setHoehe(5);
		c.setLaenge(2);
		
		System.out.println(c + " Inhalt: " + c.berechneInhalt());
		
//		printTrenner();
//		ProgressBar pb = new ProgressBar();
//		pb.start();
		
		printTrenner();
		
		// String als Dualzahl interpretieren und als Dezimalzahl ausgeben.
		System.out.println(Integer.parseInt("111", 2));
		// und zurück
		System.out.println(Integer.parseInt("7", 10));
		
		printTrenner();
		
		
				
	}	
	
	private static void printTrenner() {
		for (int i=0; i<10; i++)
			System.out.print("-");
		System.out.print(" Aufgabe Nummer: " + nr++ + " ");
		for (int i=0; i<20; i++)
			System.out.print("-");
		System.out.println();
	}
	
	
}
