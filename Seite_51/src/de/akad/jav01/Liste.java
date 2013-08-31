package de.akad.jav01;

import java.util.ArrayList;

public class Liste<E> implements List<E>{

	private ArrayList<E> liste;
	
	public Liste() {
		this.liste = new ArrayList<E>(4);
	}
	
	public Liste(int anfangskapazitat) {
		this.liste = new ArrayList<E>(anfangskapazitat);
	}
	
	public void insertFirst(E element) {
		this.liste.add(0, element);
	}

	public void insertLast(E element) {
		this.liste.add(element);
		
	}

	public void leaveFirst() {
		this.liste.remove(0);
	}

	public void leaveLast() {
		this.liste.remove(this.liste.size() -1);
	}

	public boolean isEmpty() {
		return this.liste.isEmpty();
	}

	public void insertAt(int index, E element) {
		this.liste.add(index, element);
	}

	public String toString() {
		return this.liste.size() + " Eintraege";		
	}
	
}
