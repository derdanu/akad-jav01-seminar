package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account a1 = new Account();
		a1.setKtoNummer(1);
		a1.setName("Konto 1");
		
		Account a2 = new Account(2, "Konto 2");
		
		Automat auto = new Automat();
		auto.kontoEinfuegen(a1);
		auto.kontoEinfuegen(a2);
		auto.kontoEinfuegen(3, "Konto 3");

		auto.einzahlen(1, 100);
		auto.einzahlen(3, 300);
		auto.einzahlen(2, 200);
		auto.einzahlen(1, 400);

		
		System.out.println("Kontostand: " + auto.kontoAbfragen(1));

		auto.abheben(1, 100);
		
		auto.kontoLoeschen(2);
		
		System.out.println(auto.toString());

		
		Account max = null;
		int maxGeld = 0;
		for (Account a: auto) {
			if (maxGeld < a.getGuthaben()) {
				maxGeld = a.getGuthaben();
				max = a;
			}
		}
		
		System.out.println(max);
	}
	

}
