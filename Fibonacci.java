package com.javapractice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int fnum=s.nextInt();
		int m=0;
		int n=1;
		System.out.println("The fibonacci series for the given number is:" + m +" "+n);
		for(int i=1;i<=fnum;i++) {
			int result=m+n;
			m=n;
			n=result;
			System.out.println(" "+result);
		}

		

	}

}


//Write a program that generates and
//prints a Fibonacci series of n terms,
//where n is provided by the user.