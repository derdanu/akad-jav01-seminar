package de.akad.jav01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tauschen {

	public String lesenUndTauschen() {

		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

		String in = null;
		
		System.out.println("Eingabe: ");
		
		try {
			in = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		return new StringBuilder(in).reverse().toString();
		
	}
	
}
