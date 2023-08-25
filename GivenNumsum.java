package com.javapractice;

import java.util.Scanner;

public class GivenNumsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers to get the sum:");
		int nums[]=new int[7];
		int result=0;
		int count=0;
			for(int i=0;i<7;i++) {
				nums[i]=s.nextInt();	
				if(nums[i]>=0) {
					count=count+1;
					result=result+nums[i];
					
				}
				else {
					break;
				}
				
				
			}
			if(count==nums.length) {
			System.out.println(result);
			}
		
			
		
		
		

	}

}






//Write a program that asks the user to enter a series of numbers
//(terminated by entering a negative number) and 
//calculates the sum of the positive numbers entered.