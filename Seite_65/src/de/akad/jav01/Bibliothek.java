package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

	private static Bibliothek bib = null;
	private List<Buch> buecher = new ArrayList<Buch>();
	
	private Bibliothek() {}
	
	public static Bibliothek getInstance() {
		if (bib == null)
			bib = new Bibliothek();
		return bib;
	}

	public void buchKaufen(Buch buch) {
		this.buecher.add(buch);
	}
	
	public int istBuchAusgeliehen(String titel) throws Exception {
		
		for(Buch b: buecher) {
			if (b.getTitel().equals(titel)) return b.istbuchAusgeliehen();
		}
		
		throw new Exception("nicht vorhanden");
		
	}
	
	public void buchAusleihen(String titel) throws Exception {

		for(Buch b: buecher) {
			if (b.getTitel().equals(titel)) b.buchAusleihen();
		}
	
		
	}
	
	
}
