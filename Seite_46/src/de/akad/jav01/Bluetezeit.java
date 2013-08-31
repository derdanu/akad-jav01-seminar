package de.akad.jav01;

public enum Bluetezeit {
	FRUEHLING ("Fruehling"),
	SOMMER ("Sommer"),
	HERBST ("Herbst"),
	WINTER ("Winter");
	
	private String bluetezeit;
	
	private Bluetezeit(String bluetezeit) {
		this.bluetezeit = bluetezeit;
	}
	
	public String toString() {
		
		return this.bluetezeit ;
		
	}

}
