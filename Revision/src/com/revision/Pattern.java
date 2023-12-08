package com.revision;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   
	   //outer loop
	   for(int i=1;i<=a;i++) {
		   //inner loop
		   for(int j=1;j<=b; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
		  }
	}

}
