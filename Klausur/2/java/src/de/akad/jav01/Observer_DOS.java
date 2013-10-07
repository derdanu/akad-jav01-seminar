package de.akad.jav01;

import java.util.Observable;
import java.util.Observer;

public class Observer_DOS implements Observer{
	
	@Override
	public void update(Observable o, Object arg) {
		
		System.out.println("Aenderung: " + ((String) arg) + " nach " + ((Person) o).getName());
		
	}


}
