package de.akad.jav01;

public class Klasse {

	/**
	 * Standard konstruktor
	 */
	public Klasse() {
		
	}
	
	/**
	 * Allgemeiner Konstruktor
	 */
	public Klasse(int i) {
		
	}

	/**
	 * Allgemeiner Konstruktor
	 */
	public Klasse(int i, String s) {
		
	}

	
	public void ExceptionTester() throws DummyException {
		throw new DummyException("Test");
	}
	
}
