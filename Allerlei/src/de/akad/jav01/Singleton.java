package de.akad.jav01;

public class Singleton {

	private int count;
	
	private static Singleton s = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();
		return s;
	}
	
	public void machWas() {
		this.count++;
		System.out.println(this.count);
	}
}
