package com.thread;


//"Create a class named 'Member' having the following members:
//Name, Age, Phone number, Address, Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
//and 'Manager' classes have data members 'specialization' and 'department' respectively. 
//Now, assign name, age, phone number, address and salary to an employee and a manager by making an 
//object of both of these classes and print the same

public class Employee extends Member {

	String specilization;
	
	
	public Employee(String name, int age, String phone, String address, double salary, String specilization) {
		super(name, age, phone, address, salary);
		this.specilization = specilization;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("Nitesh",22,"6207942134","Bihar,India",5000,"IT");
//		printing the variables
		System.out.println("Name :" +e.Name);
		System.out.println("Age  :" +e.Age);
		System.out.println("Phone :" +e.Phone);
		System.out.println("Address :" +e.Address);
		System.out.println("Specilization :" +e.specilization);
		
		
		//Calling the printSalary method from Member class
		e.printSalary();

	}

}
