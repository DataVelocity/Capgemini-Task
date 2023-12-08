package com.revision;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter any number:");
      int n=sc.nextInt();
      sc.close();
      if(isPrime(n)) {
    	  System.out.println(n+" is a prime number.");
      } else {
    	  System.out.println(n+" is not a prime number.");
      }
	} 
      
      public static boolean isPrime(int num) {
    	  if(num<=1) {
    		  return false;
    		  }
    	  for(int i=2; i<=Math.sqrt(num);i++) {
    		  if(num%i==0) {
    			  return false;
    		  }
    	  }
    	  return true;
    	  
      
	}

}
