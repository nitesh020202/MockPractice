package com.thread;

//"Create a class named 'Member' having the following members:
//Name, Age, Phone number, Address, Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
//and 'Manager' classes have data members 'specialization' and 'department' respectively. 
//Now, assign name, age, phone number, address and salary to an employee and a manager by making an 
//object of both of these classes and print the same

public class Member {

	String Name;
	int  Age;
	String Phone;
	String Address;
	double Salary; 
	
	public Member(String name, int age, String phone, String address, double salary) {
		super();
		Name = name;
		Age = age;
		Phone = phone;
		Address = address;
		Salary = salary;
	}
	public void printSalary() {
		System.out.println("Salary is : "+ Salary);
		
	}
	
	
}
