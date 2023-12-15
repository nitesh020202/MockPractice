package com.thread;

public class Manager extends Member{

//	"Create a class named 'Member' having the following members:
//	Name, Age, Phone number, Address, Salary
//	It also has a method named 'printSalary' which prints the salary of the members.
//	Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
//	and 'Manager' classes have data members 'specialization' and 'department' respectively. 
//	Now, assign name, age, phone number, address and salary to an employee and a manager by making an 
//	object of both of these classes and print the same
	
	String dept;
	

//	Creating Constuctor using variable of Member  and varaible of Manager class also
	public Manager(String name, int age, String phone, String address, double salary,
			String dept) {
		super(name, age, phone, address, salary);
		this.dept = dept;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager e = new Manager("Rahul",22,"6207942134","Bihar,India",5000,"IT");
//		printing the variables
		System.out.println("Name :" +e.Name);
		System.out.println("Age  :" +e.Age);
		System.out.println("Phone :" +e.Phone);
		System.out.println("Address :" +e.Address);
		System.out.println("Department :" +e.dept);
		
		//Calling the printSalary method from Member class
		e.printSalary();

	}

}
