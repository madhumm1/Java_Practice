package com.javapractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int fact=s.nextInt();
		int result=fact;
		if(fact==0) {
		System.out.println("The factorial is 1");
		}
		else if(fact<0) {
			System.out.println("Enter a non-negative integer:");
		}
		else {
			for(int i=1;i<fact;i++) {
				result = result * (fact-i);
			}
			System.out.println("The factorial of give number is:"+result);
		}

	}

}




//Write a program that asks the user 
//to enter a number and 
//prints the factorial of that number.