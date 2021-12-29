package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * 	Encapsulation is the process of wrapping code and data together.
 * 	Through encapsulation we achieve control over data and data hiding.
 * 	
 * 	Data Hiding - We use specific access modifiers to limit the 
 * 				  access of a particular variable from another class/package.
 * 
 * 	Control over data -  We can use getters/setters to make the fields
 * 						 either read/write only or both.
 * 
 * 	Access Modifiers - 
 * 
 * 	1.Private - Only within the class
 * 	2.Default - Only within the package
 * 	3.Protected - Within the package + Outside package through child class
 * 	4.Public - From everywhere
 *
 */

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee_Encapsulation employee=new Employee_Encapsulation();
		
		//We have to make use of getter and setter method;
		
		employee.setName("Alice");
		employee.setSalary(2000);
		//this will fail because we have a condition in setter
		employee.setEmployeeId(50);

		employee.displayInfo();
	}

}

class Employee_Encapsulation{
	
	//making use of "private" access specifiers so that it is not accessible
	//from outside class
	
	private String name;
	private int employeeId = 1;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	//We can make use of the setter to limit setEmployeeId operation only to Admin
	public void setEmployeeId(int employeeId) {
		boolean isAdmin = false;
		if (!isAdmin) {
			System.out.println("Only Admin can set the Employee ID");
		} else {
			this.employeeId = employeeId;
		}
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void displayInfo() {
		
		System.out.println("Employee Details::" + name + " " + salary+" "+employeeId);
	}
	
}