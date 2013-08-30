package de.akad.jav01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Kartenstapel {

	private List<Karte> stapel = new ArrayList<Karte>();
	
	public Kartenstapel() {
		
		int i,j;
		
		for (i=0;i<8;i++) {
			for (j=0;j<4;j++) {
				stapel.add(new Karte(Typ.get(j), Art.get(i)));
			}
		}
		
	}
	
	public Karte ziehen() {
		
		Random rand = new Random();
		return stapel.get(rand.nextInt(32));
	}
	
	public void mischen() {
		Collections.shuffle(stapel);

	}
	
	public void alleKartenZeigen() {
		
		for (Karte k: stapel) {
			System.out.print(k.toString() + " - ");
		}
		System.out.println();
	}
}
