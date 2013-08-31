package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Liste<String> arr1 = new Liste<String>();
		arr1.insertFirst("Test 1");
		System.out.println(arr1.toString());
		arr1.insertFirst("Test 2");
		arr1.insertLast("Test Ende");
		System.out.println(arr1.toString());

		Liste<String> arr2 = new Liste<String>(2);
		arr2.insertAt(0, "Test");
		arr2.insertAt(0, "Test");
		System.out.println(arr2.toString());
		
		arr2.leaveFirst();
		arr2.leaveLast();
		
		System.out.println(arr2.toString());

		if (arr2.isEmpty()) System.out.println("Leer");
		
	}

}
