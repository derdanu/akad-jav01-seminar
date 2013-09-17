package de.akad.jav01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Automat implements Iterable<Account>{
	
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
	
	public void abheben(int kontonummer, int betrag) {
		try {
			getAccount(kontonummer).abheben(betrag);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void einzahlen(int kontonummer, int betrag) {
		try {
			getAccount(kontonummer).einzahlen(betrag);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Account getAccount(int ktoNummer) {
		
		for (Account a: this.alleKonten) {
			if (a.kontoGleich(ktoNummer)) return a;
		}
		
		return null;
		
	}

	@Override
	public Iterator<Account> iterator() {
		return this.alleKonten.iterator();
	}

}
