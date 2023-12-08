package com.revision;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your number: ");
     Scanner sc=new Scanner(System.in);
     int button=sc.nextInt();
     
     switch(button) {
     case 1:{
    	 System.out.println("Perfect");
    	 break;
     }
     case 2:{
    	 System.out.println("Great");
    	 break;
     }
     case 3:{
    	 System.out.println("Incredible");
    	 break;
     }
     case 4:{
    	 System.out.println("Geogrous");
    	 break;
     }
     default: System.out.println("Invalid Input");
     
     }
	}

}
