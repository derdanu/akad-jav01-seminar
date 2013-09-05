package de.akad.jav01;

public class Main {

	public static void main(String[] args) {

		double a,b;
		a = 25/4;
		b = 25/4.0;
		
		System.out.println(a + " " + b);
	
		
		
		Klasse c = new Klasse();
		try {
			
			c.ExceptionTester();
			
		} catch (DummyException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		s1.machWas();
		s2.machWas();
		s3.machWas();
		s1.machWas();

		
	}
	
	
}
