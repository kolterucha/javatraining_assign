package com.corejava.day3;

import java.util.Scanner;

public class AddingToString {
	public static String addStringToStringUsingSubString(String firstString, String secondString, int pos) {
		return firstString.substring(0, pos) + secondString + firstString.substring(pos);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String firstString = sc.nextLine();
		System.out.println("Enter 2nd String");
		String SecondString = sc.next();

		System.out.println("Eneter Index");
		String ThirdString = addStringToStringUsingSubString(firstString, SecondString, sc.nextInt());

		System.out.println(ThirdString);
	}
}
