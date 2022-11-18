package com.corejava.day1;

import java.util.Scanner;

public class Pallindrom {
public static void main(String[] args) {
	int r; int temp;
	int sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number To check Pallindrome");
	int n=sc.nextInt();
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
		
	}
	if(temp==sum)
		System.out.println("number is Pallindrome");
	else
		System.out.println("number is Not Pallindrome");
}
}
