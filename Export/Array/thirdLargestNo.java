package com.corejava.array;

public class thirdLargestNo {

	public static void main(String[] args)
	{
		
		 
		   int array[] = {1, 2, 22, 88, 92};
		  int size = array.length;
		  int temp;
		  
		   for(int i = 0; i<size; i++ )
		   
		   {
		      for(int j = i+1; j<size; j++)
		      {
		         if(array[i]>array[j])
		         {
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println("Third largest number is:: "+array[size-3]);
		

	}

}
