package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Druckbar> arr = new ArrayList<Druckbar>();
		
		Giro giro = new Giro();
		giro.setNummer(1);
		giro.setSaldo(100);
		giro.setLimit(1000);
		
		arr.add(giro);
		
		Spar spar = new Spar();
		spar.setNummer(2);
		spar.setSaldo(1000.5);
		spar.setZinssatz(0.03);
		
		arr.add(spar);
		
		Rechnung rech =  new Rechnung();
		rech.setName("Rechnung 1");
		rech.setSumme(125.43);
		
		Datum datum = new Datum();
		datum.setTag(1);
		datum.setMonat(3);
		datum.setJahr(2013);
		
		
		rech.setDatum(datum);
		
		Anschrift anschrift = new Anschrift();
		anschrift.setOrt("Musterort");
		anschrift.setStrasse("Musterstrasse");
		
		rech.setAnschrift(anschrift);
		
		arr.add(rech);
		
		Brief brief = new Brief();
		brief.setText("Brieftext");
		
		arr.add(brief);
		
		for (Druckbar o: arr) {
			
			o.ausgabe();
			
		}
		
		
		
	}

}
