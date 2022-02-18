package org.emp;

public class Employee {
	private void empId() {
		System.out.println("293085");
	}

	private void empName() {
		System.out.println("Yuvaraj");
	}

	private void empDob() {
		System.out.println("15021993");
	}

	private void empPhone() {
		System.out.println("123456789");
	}

	private void empEmail() {
		System.out.println("yuvarajazhagar@gmail.com");
	}

	private void empAddress() {
		System.out.println("ABCD");
	}

	public static void main(String[] args) {
		Employee A = new Employee();
		A.empAddress();
		A.empDob();
		A.empEmail();
		A.empId();
		A.empPhone();
	}
}
