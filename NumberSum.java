package com.javapractice;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int num = s.nextInt();
		if(num>0) {
			int result = 0;
			for(int i=1;i<=num;i++) {
				
						result= result+i;	
			}
			System.out.println(result);
		}
		else {
			System.out.println("You entered a negative number or zero");
		}

	}

}


//Write a program that asks the user to enter a positive integer 
//and calculates the sum of all the numbers from 1 to that integer.