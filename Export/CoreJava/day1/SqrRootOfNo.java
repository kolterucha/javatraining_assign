package com.corejava.day1;

import java.util.Scanner;

public class SqrRootOfNo {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
     System.out.println("Enter a number : ");  
     int n = sc.nextInt();  
     Double squareroot = Math.pow(n, 0.5);
     System.out.println("The Square Root of Number : " + squareroot);

}  
}

