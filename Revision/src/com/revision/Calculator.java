package com.revision;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter first number:  ");
  Scanner sc=new Scanner(System.in);
  Double a=sc.nextDouble();
  System.out.println("Enter second number: ");
  double b=sc.nextDouble();
  System.out.println("Enter Operator: ");
   char Op = sc.next().charAt(0);
   
  switch(Op){
  case '+': {
	  double sum=a+b;
	  System.out.println("sum of two Digit:" + sum);
	  break;
  } 
  case '-':{
	  double sub=a-b;
	  System.out.println("Substration of two digit"+ sub);
	  break;
  }
  case '*':{
	  double multiply=a*b;
	  System.out.println("Multiplication of two digit:"+ multiply);
	  break;
  }
  case '/':{
	  double division =a/b;
		  System.out.println("Division of two digit:"+ division);
		  break;
	  }
  default: System.out.println("Not valid");
  }
	  
  }
  
	}


