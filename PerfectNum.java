package com.javapractice;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int pnum=s.nextInt();
		int result=0;
		if(pnum>0) {
			for(int i=1;i<pnum;i++) {
				if(pnum%i==0) {
					result=result+i;
				}
			}
			if(pnum==result) {
				System.out.println("It is a perfect number");
			}
			else {
				System.out.println("It is not a perfect number");
			}
			
		}
		else {
			System.out.println("Enter a positive number");
		}

	}

}




//Write a program that prompts the user to 
//enter a positive integer and 
//checks if it is a perfect number or not. 
//A perfect number is a positive integer 
//that is equal to the sum of its proper divisors 
//(excluding itself).