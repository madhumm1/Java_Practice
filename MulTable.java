package com.javapractice;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to get multiplication table for that:");
		int num=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num + "*"+ i +"=" +num*i);
		}
		

	}

}





//Write a program that prompts the user to enter a number 
//and prints the multiplication table for that number up to 10.