package org.basic1;

public class Example {

	private void father() {
		System.out.println("My Father");
	}

	private void mother() {
		System.out.println("My mother");
	}

	private void brother() {
		System.out.println("My brother");
	}

	public static void main(String[] args) {
		Example a = new Example();
		a.brother();
		a.father();
		a.mother();
	}
}
