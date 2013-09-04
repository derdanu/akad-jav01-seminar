package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bibliothek bib = Bibliothek.getInstance();
		
		Buch b1 = new Buch();
		b1.setTitel("Buch 1");
		
		Buch b2 = new Buch();
		b2.setTitel("Buch 2");
		
		Buch b3 = new Buch();
		b3.setTitel("Buch 3");
		
		bib.buchKaufen(b1);
		bib.buchKaufen(b2);
		bib.buchKaufen(b3);
		
		// Dummy Code -> soll über View erledigt werden.
		try {
			bib.buchAusleihen(b1.getTitel());
			System.out.println(b1.getTitel() + " -> Status: " + bib.istBuchAusgeliehen(b1.getTitel()));
			System.out.println(b2.getTitel() + " -> Status: " + bib.istBuchAusgeliehen(b2.getTitel()));
			bib.buchAusleihen(b3.getTitel());
			System.out.println(b3.getTitel() + " -> Status: " + bib.istBuchAusgeliehen(b3.getTitel()));
			bib.buchAusleihen(b3.getTitel());
		} catch (Exception e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
	}

}
