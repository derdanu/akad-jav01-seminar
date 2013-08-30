package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account();
		a1.setKtoNummer(1);
		a1.setName("Konto 1");
		
		Account a2 = new Account(2, "Konto 2");
		
		Automat auto = new Automat();
		auto.kontoEinfuegen(a1);
		auto.kontoEinfuegen(a2);
		auto.kontoEinfuegen(3, "Konto 3");

		auto.einzahlen(1, 100);
		System.out.println(auto.kontoAbfragen(1));
		
		auto.kontoLoeschen(2);
		
		System.out.println(auto.toString());

		
	}
	

}
