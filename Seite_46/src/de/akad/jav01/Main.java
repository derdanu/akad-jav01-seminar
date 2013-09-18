package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pflanze<String> p1 = new Pflanze<String>(	"Pflanze 1", 
													Bluetezeit.FRUEHLING, 
													"Beschreibung als String");
		
		Pflanze<Beschreibung> p2 = new Pflanze<Beschreibung>(	"Pflanze 2", 
																Bluetezeit.SOMMER, 
																new Beschreibung("Die Kornblume gehoert zur Pflanzenart Korbbluetler", "wenig giessen")
															);
		
		Pflanze<String> p3 = new Pflanze<String>(	"Pflanze 3", 
													Bluetezeit.FRUEHLING, 
													"Beschreibung als String");

		Pflanze<Beschreibung> p4 = new Pflanze<Beschreibung>(	"Pflanze 4", 
													Bluetezeit.SOMMER, 
													new Beschreibung("Die ... gehoert zur Pflanzenart ...", "viel giessen")
												);
		
		Pflanze<String>[] pfl = new Pflanze[2];
		
		pfl[0] = p1;
		pfl[1] = p3;
		
		for (Pflanze<String> p : pfl) {
			
			System.out.println("Name: " + p.getName() + "; Beschreibung: " + p.getBeschreibung());
			
		}
		
		Pflanze<Beschreibung>[] pfl2 = new Pflanze[2];
		
		pfl2[0] = p2;
		pfl2[1] = p4;
		
		
				
		for (Pflanze<Beschreibung> p : pfl2) {
			
			System.out.println("Name: " + p.getName() + "; Beschreibung: " + p.getBeschreibung().toString());
			
		}		
		
	
		
	}

}
