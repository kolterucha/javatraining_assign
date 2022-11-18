package com.corejava.day2;

import java.util.Scanner;

public class EmployeeMaster {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter the Employee Name");
		String Name=sc.next();
		System.out.println("Enter the Employee Basic Salary");
		int bsal=sc.nextInt();
		Employee e = new Employee(id,Name, bsal);
		e.netSal();
		e.Display();
		
	}
}
}
