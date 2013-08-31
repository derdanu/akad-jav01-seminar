package de.akad.jav01;
import de.akad.jav01.Druckbar;
import de.akad.jav01.Konto;


public class Spar extends Konto implements Druckbar {

		private double zinssatz;
		
		public void ausgabe() {
			System.out.println("Kontonummer: " + this.getNummer() + "; Saldo: " + this.getSaldo() + " Zinssatz " + this.zinssatz);
		}

		public double getZinssatz() {
			return zinssatz;
		}

		public void setZinssatz(double zinssatz) {
			this.zinssatz = zinssatz;
		}
		
		
	
}
