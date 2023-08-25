package com.javapractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String userInput=s.nextLine();
		System.out.println(userInput.length());
		StringBuilder reverseString=new StringBuilder();
		for(int i=userInput.length()-1;i>=0;i--) {
			reverseString.append(userInput.charAt(i));
			
		}
		System.out.println(reverseString);
		
		
		
		

	}

	

}
