package de.akad.jav01;

public class DummyException extends Exception {

	public DummyException() {
		super();
	}
	
	public DummyException(String s) {
		super(s);
	}
	
	@Override
	public String getMessage() {
		return "Meine Exception: " + super.getMessage();				
	}
}
