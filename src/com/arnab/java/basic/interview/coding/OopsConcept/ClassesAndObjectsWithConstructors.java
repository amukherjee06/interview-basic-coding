package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * 
 * @author ARNAB
 * 
 * OBJECT - An entity that has properties and behaviors.
 * 			It has 3 features: -
 * 			a>Properties or Fields
 * 			b>Behavior or Methods or Functions
 * 			c>Identity - To be used by JVM
 * 
 * CLASS - 	A blueprint to create one/more objects.We can use 'new' operator to create an Object.
 * 
 *			We can initialize Objects in 3 ways: -
 *			a>Reference Variable
 *			b>Methods
 *			c>Constructors
 *
 *	If we write a class nothing happens.
 *	Only when we initialize an object of that class JVM allocates a memory to
 *	store the object.
 *
 *	PFB the Employee example
 *
 */

public class ClassesAndObjectsWithConstructors {

	public static void main(String[] args) {

		//Creating an Object of the Employee class
		//invoking their display method
		//Similarly,thousands of Objects can be created using the below mentioned blueprint.
		
		//Employee() - JVM is provided with a default implementation of Constructor.
		//We can create our own parameterized constructors to create an object
		
		Employee employee1= new Employee();
		employee1.id=1;
		employee1.name="John Doe";
		employee1.salary=1000;
		
		employee1.displayInformation();
		
		//Using Parameterized Constructors
		Employee employee2=new Employee(2, "John Smith", 2000);
		employee2.displayInformation();
	}

}

/**
 * 
 * @author ARNAB
 * 
 * Employee has : -
 * 				1>Fields such as employee id,name,salary
 * 				2>Behavior to display it's own information
 */
class Employee{
	
	//Constructor Overloading
	//Same Constructor with different set of accepted parameters
	public Employee() {
	}
	
	public Employee(long id,String name,int salary) {
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	long id;
	String name;
	int salary;
	
	void displayInformation() {
		
		System.out.println(name+" "+id+" "+salary+" ");
	}
}
