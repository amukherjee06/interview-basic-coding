package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * 
 * One class implementing multiple Interface
 *
 */
public class MultipleInheritanceThroughInterface {

	public static void main(String[] args) {
		
		Child c =new Child();
		c.printOne();
		c.printTwo();
		c.printThree();	
	}

}

interface one{	
	void printOne();
}

interface two{
	void printTwo();
}

interface three extends one,two{
	void printThree();
}

/**
 * 	Child class needs to implement all the methods
 * 	It is implementing both A and B.This is an example of multiple inheritance.
 *
 */
class Child implements three{

	@Override
	public void printOne() {
		
		System.out.println(1);
	}

	@Override
	public void printTwo() {
		System.out.println(2);		
	}

	@Override
	public void printThree() {
		System.out.println(3);		
	}
	
	
}