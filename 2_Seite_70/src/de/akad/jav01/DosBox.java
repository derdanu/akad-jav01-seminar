package de.akad.jav01;

import java.util.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DosBox implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		List<String> altneu = (ArrayList<String>) arg; 
		System.out.println("Name " + altneu.get(0) + " wurde geändert in " + altneu.get(1));
	}

}
