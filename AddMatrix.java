package com.javapractice;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int matrix1[][]=new int[3][3];
		int matrix2[][]=new int[3][3];
		System.out.println("Enter elements of the matrix1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix1[i][j]=s.nextInt();
				System.out.println(matrix1[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("Enter elements of the matrix2");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix2[i][j]=s.nextInt();
				System.out.println(matrix2[i][j]);
			}
			System.out.println();
		

	}
		int addMatrix[][]=new int[3][3];
		
	  for (int i=0;i<3;i++) {
		  for(int j=0;j<3;j++) {
			  addMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			  
		  }
		  System.out.println();
	  }
	  
	  System.out.println("The result of Matrix Addition is:");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(addMatrix[i][j] + " ");
          }
          System.out.println();
      }


	}
}
