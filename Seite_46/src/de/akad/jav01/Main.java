package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Pflanze<String> p1 = new Pflanze<String>("Pflanze 1", Bluetezeit.FRUEHLING, "Beschreibung als String");
		Pflanze<Beschreibung> p2 = new Pflanze<Beschreibung>("Pflanze 2", Bluetezeit.SOMMER, new Beschreibung("Die Kornblume gehoert zur Pflanzenart Korbbluetler", "wenig giessen"));
		
	
		System.out.println("Name: " + p1.getName() + "; Beschreibung: " + p1.getBeschreibung());
		System.out.println("Name: " + p2.getName() + "; Beschreibung: " + p2.getBeschreibung().toString());
	
		
	}

}
