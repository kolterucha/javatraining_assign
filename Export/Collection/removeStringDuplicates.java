package com.collection.assgn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeStringDuplicates {
	
	public List<String> removeDuplicate(List<String> l)
	{   
		List<String> al=new ArrayList<>();
		
			for (String st : l) {
				if(!al.contains(st))
				{
					al.add(st);
				}
			}
			return al;
			
		
		
		
		
	}
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("Rucha");
		al.add("Sami");
		al.add("Rucha");
		al.add("Rucha");
		al.add("Sayali");
		al.add("Tilu");
//		System.out.println(al);
//		Collections.sort(al);
		List<String> rd = new removeStringDuplicates().removeDuplicate(al);
		Collections.sort(rd);
		Collections.reverse(rd);
		System.out.println("String after removing duplicate elements are : "+rd);
		
	}

}
