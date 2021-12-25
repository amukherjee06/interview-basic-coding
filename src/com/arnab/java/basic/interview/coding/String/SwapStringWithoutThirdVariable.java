package com.arnab.java.basic.interview.coding.String;

/*
 * Inuput - 
 * 
 * a=First b=Second
 * 
 * Expected Output -
 * 
 * a=Second b=First
 */

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		
		//1) Append second string to first string and 
		// store in first string:
		
		String a ="Arnab";
		String b="Mukherjee";
		
		System.out.println("Before Swap :: a="+a+" and b="+b);
		
		a=a+b;
		
		//2) call the method substring(int beginindex, int endindex)
		// by passing beginindex as 0 and endindex as a.length() - b.length()
		
		b = a.substring(0, (a.length()-b.length()));
		
		//call the method substring(int beginindex) by passing 
		// b.length() as argument to store the value of initial 
		// b string in a
		// a = substring(b.length());
		
		a = a.substring(b.length());
		
		System.out.println("After Swap :: a="+a+" and b="+b);

	}

}
