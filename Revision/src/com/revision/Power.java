package com.revision;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int ans=1;
		
		for(int i=1;i<=n;i++) {
			ans=ans*x;
		}
		System.out.println("power n:"+ ans);
	}

}
