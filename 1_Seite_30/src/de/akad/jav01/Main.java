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

		try {
			auto.einzahlen(1, 100);
		} catch (Exception e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		System.out.println("Kontostand: " + auto.kontoAbfragen(1));

		try {
			auto.abheben(1, 300);
		} catch (Exception e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		auto.kontoLoeschen(2);
		
		System.out.println(auto.toString());

		
	}
	

}
