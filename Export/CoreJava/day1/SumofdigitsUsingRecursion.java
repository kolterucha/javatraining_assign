package com.corejava.day1;

public class SumofdigitsUsingRecursion {
public static void main(String[] args) {
	 int sum=0;
	    
     int a=sumOfDigits(sum,0);    
     System.out.println(a);
 }



private static int sumOfDigits(int sum, int i) {
     // TODO Auto-generated method stub
     if(i<10)
     {
         sum=sum+i;
     return    sumOfDigits(sum, ++i);
     }
     return sum;
     
}
}
