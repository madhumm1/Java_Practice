package com.javapractice;

import java.util.Scanner;

public class MaxArrayNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nums[]=new int[5];
		System.out.println("Enter elements of an array");
		for(int i=0;i<5;i++) {
			nums[i]=s.nextInt();
			System.out.println(nums[i]);
		}
		int Max=0;
		for(int i=0;i<=3;i++) {
			if(nums[i]>nums[i+1]) {
				Max= nums[i];
				
			}
			else {
				Max=nums[i+1];
			}
	}
		System.out.println("The Maximum element in an array is"+ Max);
		

	}

}
