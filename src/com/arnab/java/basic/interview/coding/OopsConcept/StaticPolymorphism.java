package com.arnab.java.basic.interview.coding.OopsConcept;

/**
 * Polymorphism is an OOPS concept through which 
 * we can perform single action in multiple ways.
 * 
 * There are 2 types of Polymorphism - 
 * 1.Runtime Polymorphism - Discussed with Inheritance
 * 2.Complie time Polymorphism -To be explained below
 * 	
 *
 */
public class StaticPolymorphism {

	public static void main(String[] args) {

		Multiply m = new Multiply();
		m.multiply(10, 20);
		
	}

}

/**
 * 
 * Same method name but different arguments
 *
 */
class Multiply{
	
	void multiply(int a,int b) {
		
		System.out.println(a*b);
	}
	
	void multiply(double a,int b) {
		System.out.println(a*b);
	}
	
	void multiply(double a,double b) {
		System.out.println(a*b);
	}
	
	void multiply(long a,long b) {
		System.out.println(a*b);
	}
}