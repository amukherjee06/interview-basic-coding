package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * 
 * Inheritance is an important pillar of OOPS concept. It allows one class to
 * inherit the features(fields and methods) of another class. Inheritance
 * supports re-usability of common features of multiple classes.
 *
 */

public class SimpleInheritanceAndRuntimePolymorphism {

	public static void main(String[] args) {
		
		JavaDeveloper javaDev=new JavaDeveloper("John", 1000, "Developer", "Java");
		Manager manager=new Manager("Alex", 2000, "Manager");
		
		/**	1.Calling all the parent class methods
		*	As a child class it will inherit 
		*	all the parent class features(methods in this case)
		**/
		javaDev.specificJavaDeveloperMethod();
		javaDev.specificDeveloperMethod();
		javaDev.specificEmployeeMethod();
		
		manager.specificManagerMethod();
		manager.specificEmployeeMethod();
		
		/** 2.displayEmployeeInfo is present in all the classes
		*	If we call this method now, JavaDeveloper class's method
		*	will override all the above parent's class's methods.
		*	This is called Runtime Polymorphism.
		*
		*	If JavaDeveloper class doesn't have displayEmployeeInfo method
		*	control will go to immediate parent class for such a method.
		*	The propagation will continue like that.But we can have the same
		*	object reference to call the method.
		*
		*	--Comment out respective methods to try out the flows.
		**/
		
		javaDev.displayEmployeeInfo();
		manager.displayEmployeeInfo();

	}

}

class EmployeeInheritance {

	String name;
	int salary;

	public EmployeeInheritance(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	void displayEmployeeInfo() {

		System.out.println("Employee Details::" + name + " " + salary);

	}
	
	void specificEmployeeMethod() {
		System.out.println("Specific method present in Employee class");
	}
}

class Developer extends EmployeeInheritance {

	String role;

	public Developer(String name, int salary, String role) {
		super(name, salary);
		this.role = role;
	}

	void displayEmployeeInfo() {

		System.out.println("Employee Details::" + name + " " + salary + " " + role);

	}
	
	void specificDeveloperMethod() {
		System.out.println("Specific method present in Developer class");
	}
}

class Manager extends EmployeeInheritance {

	String role;

	public Manager(String name, int salary, String role) {
		super(name, salary);
		this.role = role;
	}

	void displayEmployeeInfo() {

		System.out.println("Employee Details::" + name + " " + salary + " " + role);

	}
	
	void specificManagerMethod() {
		System.out.println("Specific method present in Manager class");
	}
}

class JavaDeveloper extends Developer {

	String language;

	public JavaDeveloper(String name, int salary, String role, String language) {
		super(name, salary, role);
		this.language = language;
	}

	/*void displayEmployeeInfo() {

		System.out.println("Employee Details::" + name + " " + salary + " " + role+" "+language);

	}*/
	
	void specificJavaDeveloperMethod() {
		System.out.println("Specific method present in JavaDeveloper class");
	}
	
}
