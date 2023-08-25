package com.javapractice;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int nums[]=new int[size];
		System.out.println("Enter"+ size + "Elements of the Array");
		for(int i=0;i<size;i++) {
			nums[i]= s.nextInt();
			System.out.println(nums[i]);	
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+nums[i];
		}
		System.out.println("The total sum of array elements is:"+sum);

	}

}
