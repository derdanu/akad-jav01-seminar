package de.akad.jav01;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KundenContainer container = new KundenContainer();
		
		Erstkunde k1 = new Erstkunde();
		k1.setName("Kunde 1");
		Grosskunde k2 = new Grosskunde();
		k2.setName("Kunde 2");
		Kleinkunde kk = new Kleinkunde();
		kk.setName("Max Mustermann");
		
		container.kundeAufnehmen(k1);
		container.kundeAufnehmen(k2);
		container.kundeAufnehmen(kk);
		
		System.out.println(container.toString());
		
		container.kundeEntfernen(k1);
		
		System.out.println(container.toString());
		
		ArrayList<Kunde> kunden = container.getAlleKundenNamen("M");
		
		if (kunden.size() == 1) {
		
			kunden.get(0).erhoeheMonatsUmsatz(100, 1);
			kunden.get(0).erhoeheMonatsUmsatz(1000, 3);
			kunden.get(0).erhoeheMonatsUmsatz(900, 5);
			kunden.get(0).erhoeheMonatsUmsatz(8000, 12);
			
			System.out.println(kunden.get(0).toString());
			
		}
		
		kunden = container.getAlleKundenNamen("K");
		
		for (Kunde k: kunden) {
			
			container.kundeEntfernen(k);
			
		}
		
		System.out.println(container.toString());
	
		kunden = container.getAlleKundenNamen("M");

		kunden.get(0).erhoeheMonatsUmsatz(10000, 3);
		System.out.println(kunden.get(0).toString());

		
	}
	
}
