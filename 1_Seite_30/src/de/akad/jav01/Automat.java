package de.akad.jav01;

import java.util.*; 

public class Automat {
	
	List<Account> alleKonten = new ArrayList<Account>();
	
	// weitere Methoden
	public void kontoEinfuegen ( int ktoNummer, String name ) {
		alleKonten.add ( new Account ( ktoNummer, name) ); 
	}
	
	public void kontoEinfuegen ( Account konto ) {
		alleKonten.add ( konto );
	}

	public void kontoLoeschen ( int ktoNummer ) {
		Account a = null;
		for ( int i=0;i<alleKonten.size();i++) {
			a = alleKonten.get ( i );
			if ( a.getKtoNummer ( ) == ktoNummer ) {
				alleKonten.remove ( a );
			}
		} 
	}

	public String kontoAbfragen (int ktoNummer) {
		
		return Integer.toString(getAccount(ktoNummer).getGuthaben());

	}
	
	public String toString() {
		
		return alleKonten.size() + " Konten verfuegbar";
	}
	
	public void abheben(int kontonummer, int betrag) throws MyException {
		getAccount(kontonummer).abheben(betrag);
	}
	
	public void einzahlen(int kontonummer, int betrag) throws MyException {
		getAccount(kontonummer).einzahlen(betrag);
	}
	
	private Account getAccount(int ktoNummer) {
		
		for (Account a: this.alleKonten) {
			if (a.kontoGleich(ktoNummer)) return a;
		}
		
		return null;
		
	}

}
