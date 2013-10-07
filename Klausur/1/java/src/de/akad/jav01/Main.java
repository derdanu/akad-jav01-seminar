package de.akad.jav01;

import java.util.Scanner;

import de.akad.jav01.Datum.InvalidDateArgumentsException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String datum;
		String datums[];
		
		do {

			System.out.println("Bitte Datum eingeben. Format tt.mm.YYYY - Zum Beenden quit");

			datum = sc.next();
			datums = datum.split("\\.");			

			if (!datum.equals("quit")) {

				Datum date;
				try {
					date = new Datum(Integer.parseInt(datums[0]), Integer.parseInt(datums[1]), Integer.parseInt(datums[2]));
					
					System.out.println("Heute: " + date);
					System.out.println("Morgen: " + date.gibNaechstenTag());
					
					
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidDateArgumentsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
						
		
			
		} while (!datum.equals("quit"));
		
				
		
		
		
		
		
	}

}
