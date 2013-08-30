package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Rot hat einen Gewinn von: ");
		
		Farbe f = Farbe.ROT;
		Farbe.gewinn(f);

		System.out.println("Wuerfeln ;-)");
		
		List<Farbe> list = new ArrayList<Farbe>();
	
		list.add(Farbe.GELB);
		list.add(Farbe.ROT);
		list.add(Farbe.GRUEN);
		list.add(Farbe.BLAU);
		list.add(Farbe.WEISS);
		
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.print("Der Gewinn lautet: ");
			Farbe.gewinn(list.get(rand.nextInt(5)));	
		}
		
		
		
		
	}

}
