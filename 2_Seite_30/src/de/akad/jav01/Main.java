package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kartenstapel stapel = new Kartenstapel();
		Karte karte = stapel.ziehen();
		
		System.out.println(karte.toString());
		
		stapel.alleKartenZeigen();
		stapel.mischen();
		stapel.alleKartenZeigen();
		
	}

}
