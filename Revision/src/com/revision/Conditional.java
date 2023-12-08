package com.revision;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("What is your age: ");
     Scanner sc=new Scanner(System.in);
     int age=sc.nextInt();
     if(age>21) {
    	 System.out.println("You are eligible 4 Voting");
     } else if(age<0) {
    	 System.out.println("Not Valid 🤣 Try Again!");
     } else {
    	 System.err.println("Not Eligible");
     }
    	 	 
	}

}
