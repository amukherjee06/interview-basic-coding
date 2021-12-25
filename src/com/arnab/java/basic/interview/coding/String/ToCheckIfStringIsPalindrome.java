package com.arnab.java.basic.interview.coding.String;

/*
 * A string is said to be a palindrome 
 * if it is the same if we start reading it 
 * from left to right or right to left
 * 
 * Input : str = "abba" 
 * Expected Output: Yes
 */
public class ToCheckIfStringIsPalindrome {

	public static void main(String[] args) {

		String str = "Madam";
		
		if(isPalindrome(str.toLowerCase())) {
			System.out.println("The given string "+str+" is a Palindrome");
		}
		else {
			System.out.println("The given string "+str+" is not a Palindrome");
		}
	}

	static boolean isPalindrome(String str) {
	//Creating 2 pointers
	int i = 0, j=str.length()-1;
	
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	}
}
