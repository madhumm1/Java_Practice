package com.javapractice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String userInput=s.nextLine();
		String lowerCaseUI = userInput.toLowerCase();
        //System.out.println(userInput.length());
		StringBuilder reverseString=new StringBuilder();
		for(int i=lowerCaseUI.length()-1;i>=0;i--) {
	    reverseString.append(lowerCaseUI.charAt(i));
			
		}
		String RS=reverseString.toString();
		String lowerCaseRS = RS.toLowerCase();
		System.out.println(lowerCaseUI);
		System.out.println(lowerCaseUI.length());
		System.out.println(lowerCaseRS);
		System.out.println(lowerCaseRS.length());
		
		if(lowerCaseUI.equals(lowerCaseRS)) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("Its not palindrome");
		}
		
		
		
		
		

	}

}
