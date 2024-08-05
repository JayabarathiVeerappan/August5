package org.emp;

public class Employee {
	private void empId() {
		System.out.println("emp id is 2345");
	}
	private void empName() {
		System.out.println("emp name is Jayabarathi");
	}
	private void empDob() {
		System.out.println("emp dob is 3/7/97");
	}
	private void empPhone() {
		System.out.println("emp phone is 9087456321");
	}
	private void empEmail() {
		System.out.println("emp email is jaya123@gmail.com");
	}
	private void empAddress() {
		System.out.println("emp address is Velachery, Chennai");
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
