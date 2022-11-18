package com.collection.assgn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assendingcollection {
public static void main(String[] args) {
	List<Integer> al=new ArrayList<>();
	al.add(32);
	al.add(9);
	al.add(93);
	al.add(43);
	System.out.println(al);
	Collections.sort(al);
	System.out.println("Output After Asscending Collections");
	System.out.println(al);
}
}
