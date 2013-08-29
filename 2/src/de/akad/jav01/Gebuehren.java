package de.akad.jav01;

public class Gebuehren {

		private int einheiten;
		private double online_gebuehren;
		private double druckkosten;
		private double gesamtkosten;
		
		public Gebuehren() {
			
			this.einheiten = 0;
			this.online_gebuehren = 0;
			this.druckkosten = 0;
			this.gesamtkosten = 0;
			
		}
		
		public double ermittleGebuehren(int onlinZeitInMinuten, int anzahlSeiten) {
			
			this.einheiten = ((onlinZeitInMinuten / 15 ) + 1);
			this.online_gebuehren = 0.5 * einheiten;
			
			double preis_pro_seite;
			
			if (anzahlSeiten <= 19) {
				preis_pro_seite = 0.12;
			} else if (anzahlSeiten <=49) {
				preis_pro_seite = 0.10;
			} else if (anzahlSeiten <= 100) {
				preis_pro_seite = 0.08;
			} else {
				preis_pro_seite = 0.05;
			}
			
			this.druckkosten = preis_pro_seite * anzahlSeiten;					
			
			this.gesamtkosten = this.online_gebuehren + this.druckkosten;
			
			return this.gesamtkosten;
			
			
		}
	
}
