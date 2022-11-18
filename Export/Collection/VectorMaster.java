package com.collection.assgn;
import java.util.Collections;
import java.util.Vector;

public class VectorMaster {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(21);
		v.add(3);
		v.add(34);
		v.add(9);
		v.add(67);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
	}

}
