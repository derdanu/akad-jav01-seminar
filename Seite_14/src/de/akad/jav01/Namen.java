package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class Namen {

	private List<Matrix> matrix = new ArrayList<Matrix>();
	private char[] buchstabenArray = new char[26];
	
	public Namen() {
		for(char ch='A';ch<='Z';ch++){
            matrix.add(new Matrix(ch));
        }
	}
	
	public void zeichenAusgeben(int[] pos) {
		
		for (int i=0; i<7; i++) {
			for (int p=0; p<pos.length; p++) {
				System.out.print(" ");
				for (int j=0; j<7; j++) {
					System.out.print(matrix.get(pos[p]).getElement(i, j));
				}
			}
			System.out.println();
		}
	}
	
	
}
