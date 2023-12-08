package com.revision;

import java.util.Scanner;

public class Convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Write any number in F");
     Scanner sc=new Scanner(System.in);
     Double f=sc.nextDouble();
     double c;
     c=(f-32)*5/9;
     System.out.println("Result:"+c);
	}

}
