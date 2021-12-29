package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * 
 *	- Static keyword in Java is mainly used for Memory management
 *	- Whenever a member is declared as static, it becomes the property of that particular class.
 *	which means object creation is not required for accessing the particular static member.
 *	-Following members can be made static
 *	Blocks,Variables,Methods,Classes
 *
 */

public class StaticKeyword {

	public static void main(String[] args) {
		
		//Since static method is a property of class, we do not need to create an object to
		//set company name.We are using ClassName.staticMember
		EmployeeStatic.setCompanyName("XYZ Co. Ltd.");
		
		//Though we are not passing anything for company name and employee id
		//In the below class we have taken care by using static variable and method
		//to manage memory effectively.
		EmployeeStatic emp1=new EmployeeStatic("John",1000);
		EmployeeStatic emp2= new EmployeeStatic("Alice",2000);
		
		emp1.getEmployeeInfo();
		emp2.getEmployeeInfo();

	}

}

class EmployeeStatic{
	
	String name;
	int salary;
	int employeeId;
	
	//calling static method
	public EmployeeStatic(String name,int salary) {
		this.salary=salary;
		this.name=name;
		this.employeeId=setEmployeeId();
	}
	//Static variable
	static int employeeIdCounter = 0;
	static String companyName;
	
	//static method to set employeeid
	static int setEmployeeId() {
		employeeIdCounter++;
		return employeeIdCounter;
	}
	
	//Static method to set company name
	static void setCompanyName(String name) {
		companyName=name;
	}
	
	void getEmployeeInfo() {
		
		System.out.println("Employee Information::"+name+" "+employeeId+" "+companyName+" "+salary);
	}
}
