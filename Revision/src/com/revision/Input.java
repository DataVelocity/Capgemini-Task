package com.revision;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		//Take One Input as a name  & Print out 
		
//		   System.out.println("Write down Your Name: \n");
//		   Scanner sc=new Scanner(System.in);
//		   String name=sc.next();
//		   System.out.println(name);
		
		// Take 2 variable as input  & calculate their sum
		
		System.out.println("Enter Your First Digit:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter your second Digit: ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Your Final Output is:" + sum);
	}

}
