package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class KundenContainer {

	private List<Kunde> kunden = new ArrayList<Kunde>();
	
	public void kundeAufnehmen(Kunde k) {
		
		this.kunden.add(k);
		
	}
	
	public void kundeEntfernen(Kunde k) {
		
		kunden.remove(k);
		
	}
	
	public String toString() {
		
		return kunden.size() + " Kunden vorhanden";
		
	}
	
	public ArrayList<Kunde> getAlleKundenNamen(String buchstabe) {
		
		ArrayList<Kunde> skunden = new ArrayList<Kunde>();
		for (Kunde k: this.kunden) {
			
			if (k.getName().startsWith(buchstabe)) skunden.add(k);
			
		}
		return skunden; 
	}


	
}
