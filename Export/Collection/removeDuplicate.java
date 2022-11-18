package com.collection.assgn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicate {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(33);
		al.add(92);
		al.add(33);
		al.add(54);
		al.add(9342);
		al.add(33);
		al.add(92);
		Set<Integer>s=new HashSet<>();
		s.addAll(al);
		al.clear();
		al.addAll(s);
		Collections.sort(al);
		System.out.println("Elements after removing duplicates are : "+s);
		
	}

}
