package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String zahl1 = "110";
		String zahl2 = "111";
		
		Binaerzahl bin1 = new Binaerzahl(zahl1);
		
		System.out.println("Zahl_1 binär: " + zahl1);
		System.out.println("Zahl_1 dezimal: " + Integer.parseInt(zahl1, 2));
				
		Binaerzahl bin2 = new Binaerzahl(zahl2);
		
		System.out.println("Zahl_2 binär: " + zahl2);
		System.out.println("Zahl_2 dezimal: " + Integer.parseInt(zahl2, 2));
		
		Binaerzahl summe = bin1.addiere(bin2);
		
		System.out.println("Summe binär: " + summe.getZahl());
		System.out.println("Summe dezimal: " + Integer.parseInt(summe.getZahl(), 2));

		Binaerzahl produkt = bin1.multipliziere(bin2);
		
		System.out.println("Produkt binär: " + produkt.getZahl());
		System.out.println("Produkt dezimal: " + Integer.parseInt(produkt.getZahl(), 2));
		
		
		
		
	}

}
