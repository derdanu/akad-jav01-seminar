package de.akad.jav01;

public abstract class Konto {

	private int nummer;
	private double saldo;
	
	public int getNummer() {
		return nummer;
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void einzahlen(double betrag) {
		this.saldo += betrag;		
	}
	
	public void abheben(double betrag) {
		this.saldo -= saldo;
	}
}
