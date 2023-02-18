package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * 	Abstraction is one of the concepts on OOPS by virtue of which we
 * 	hide the implementation and display only the relevant details
 *	to the end user.
 * 	
 * 	We can achieve the Abstraction by use of Abstract class and Interface.
 *
 */

public class Abstraction {

	public static void main(String[] args) {
		
		Developer_Abstraction dev=new Developer_Abstraction("Alice", 10, 2);
		dev.displayEmployeeInfo();
	}

}

abstract class Employee_Abstraction{
	
	String name;
	int dailySalary;	
	
	//Abstract Class can have constructors
	public Employee_Abstraction(String name, int dailySalary) {
		super();
		this.name = name;
		this.dailySalary = dailySalary;
	}

	//Hiding the implementation of the Monthly Salary
	//in the concrete class
	public abstract int computeMonthlySalary(int dailySalary);
	
	//Hiding the implementation of the display method
	//in the concrete class
	public abstract void displayEmployeeInfo();
}

class Developer_Abstraction extends Employee_Abstraction{

	//Field specific to the Abstract class
	int employeeId;
	
	public Developer_Abstraction(String name, int dailySalary,int employeeId) {
		super(name, dailySalary);
		this.employeeId=employeeId;
	}

	@Override
	public int computeMonthlySalary(int dailySalary) {
		return dailySalary*30;
	}

	@Override
	public void displayEmployeeInfo() {
		System.out.println(employeeId+" "+dailySalary+" "+name);
		int monthlySalary=computeMonthlySalary(dailySalary);
		System.out.println("Monthly Salary is:: "+monthlySalary);
	}
	
	
}
