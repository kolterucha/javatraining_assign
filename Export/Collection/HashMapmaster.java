package com.collection.assgn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapmaster{
	
public static void main(String[] args) {
	Map<String,Integer>m=new HashMap<>();
	m.put("Sangli", 200000);
	m.put("pune", 10000033);
	m.put("Nagar", 5000);
	m.put("Gujrat", 43786);
	System.out.println(m);
	
	 
	List<String> ks = new ArrayList<>(m.keySet());
	Collections.sort(ks);
	for (String s : ks) {
		System.out.println("\n\n");
		System.out.println(s+"  "+m.get(s));
	}
	
	
	
}
}
