package de.akad.jav01;

import java.util.Observable;

public class Artikel extends Observable {

		private int Nummer;
		private String Bezeichnung;
		private int Bestand;
		private int Mindestbestand;
		
		public Artikel(int Nummer, String Bezeichnung, int Bestand, int Mindestbestand) {
			
			this.setNummer(Nummer);
			this.setBezeichnung(Bezeichnung);
			this.setBestand(Bestand);
			this.setMindestbestand(Mindestbestand);
			
			
		}
		
		public void aendereBestand(int bestAenderung) {
			
			this.setBestand(this.getBestand() - bestAenderung);
			setChanged();
		    notifyObservers(this);

		}
		
		public String getStatus() {
			if (Bestand > Mindestbestand) {
				return "Bestand o.k.";
			} else if(Bestand == Mindestbestand) {
				return "anfragen";
			} else {
				return "bestellen";
			}
		}

		public int getNummer() {
			return Nummer;
		}

		public void setNummer(int nummer) {
			Nummer = nummer;
		}

		public String getBezeichnung() {
			return Bezeichnung;
		}

		public void setBezeichnung(String bezeichnung) {
			Bezeichnung = bezeichnung;
		}

		public int getBestand() {
			return Bestand;
		}

		public void setBestand(int bestand) {
			Bestand = bestand;
		}

		public int getMindestbestand() {
			return Mindestbestand;
		}

		public void setMindestbestand(int mindestbestand) {
			Mindestbestand = mindestbestand;
		}
			
		
	
}
