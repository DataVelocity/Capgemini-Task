package com.revision;

import java.util.Scanner;

public class SumOf3N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n=sc.nextInt();
		 
		 // sum of n natural number
//		 int sum=0;
//		 for(int i=0;i<=n; i++) {
//			 sum=sum+i;
//			}
//		 System.out.println(sum);
		 
		 // calculate table
		 for(int i=1; i<11;i++) {
			int result=n*i;
			System.out.println(n +" x " + i + " = " +result);	 
		 }
		 
		 }
		
	}


