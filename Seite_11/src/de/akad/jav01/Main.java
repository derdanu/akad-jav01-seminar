package de.akad.jav01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Artikel> alle = new ArrayList<Artikel>(); 
		
		//  5 Artikel anlegen
		Artikel a1 = new Artikel ( 1, "a", 10.0 );
		Artikel a2 = new Artikel ( 2, "a", 10.0 );
		Artikel a3 = new Artikel ( 3, "Uhr", 10.0 );
		Artikel a4 = new Artikel ( 4, "a", 10.0 );
		Artikel a5 = new Artikel ( 5, "a", 10.0 );
		
		alle.add(a1);
		alle.add(a2);
		alle.add(a3);
		alle.add(a4);
		alle.add(a5);
		
		System.out.println("Leer: " + alle.isEmpty());
		
		for (int i=0; i<alle.size(); i++) {
			System.out.println(alle.get(i));
		}
		
		for (Artikel a: alle) {
			System.out.println(a);
		}
		
		Iterator<Artikel> it = alle.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
			
	}

}
