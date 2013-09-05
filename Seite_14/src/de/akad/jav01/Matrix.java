package de.akad.jav01;

public class Matrix {

	private char[][] zeichen = new char[7][7];
	
	
	public Matrix(char c) {
		zeichenEintragen(c);
	}
	
	public void zeichenEintragen(char z) {
		for (int i=0; i<7; i++) {
			for (int j=0; j<7; j++) {
				zeichen[i][j] = z;
			}
		}
	}

	public char getElement(int z, int sp) {
		return zeichen[z][sp];
	}
	
}

