package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produkt p1 = new Produkt(new Produktbeschreibung("Gruppe 1", "Produkt 1"), Produktpreis.HIGH);
		Produkt p2 = new Produkt(new Produktbeschreibung("Gruppe 2", "Produkt 2"), Produktpreis.LOW);
		
		Produkt[] arr = new Produkt[2];
		
		arr[0] = p1;
		arr[1] = p2;
		
		for(Produkt p: arr) {
			
			System.out.println(p.toString());
			
		}
		
		Produktpreis.alleAnzeigen();
		
	}

}
