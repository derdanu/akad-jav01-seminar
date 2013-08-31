package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pflanze<String> p1 = new Pflanze<String>();
		Pflanze<Beschreibung> p2 = new Pflanze<Beschreibung>();
		
		p1.setName("Pflanze 1");
		p1.setBeschreibung("Beschreibung als String");
		
		p2.setName("Pflanze 2");
		p2.setBeschreibung(new Beschreibung("Die Kornblume gehört zur Pflanzenart Korbblütler", "wenig gießen"));
		
	
		System.out.println("Name: " + p1.getName() + "; Beschreibung: " + p1.getBeschreibung());
		System.out.println("Name: " + p2.getName() + "; Beschreibung: " + p2.getBeschreibung().toString());
	
		
	}

}
