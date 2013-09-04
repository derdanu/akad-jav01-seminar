package de.akad.jav01;

import java.util.Observable;
import java.util.Observer;

public class Dosbox implements Observer {

	 @Override public void update(Observable o, Object arg )
	 {
		 Artikel a = (Artikel) arg;
	    System.out.println(a.getBezeichnung() + " Nr. " + a.getNummer() + " Bestand : " + a.getBestand() + ", Mindestbestand : " + a.getMindestbestand() + ", " + a.getStatus());
	 }
	
}
