package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gebuehren druck = new Gebuehren();
		
		int zeit = 115;
		int seiten = 1000;
		
		System.out.println("ermittleGebuehren(" + zeit + ", " + seiten + "): " + druck.ermittleGebuehren(zeit, seiten));
		
	}

}
