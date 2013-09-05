package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bibliothek bib = Bibliothek.getInstance();
		View v = new View();
		v.pack();
		v.setVisible(true);
		
		Buch b1 = new Buch();
		b1.setTitel("Buch 1");
		
		Buch b2 = new Buch();
		b2.setTitel("Buch 2");
		
		Buch b3 = new Buch();
		b3.setTitel("Buch 3");
		
		bib.buchKaufen(b1);
		bib.buchKaufen(b2);
		bib.buchKaufen(b3);
		
		
		
	}

}
