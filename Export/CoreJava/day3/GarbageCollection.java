package com.corejava.day3;

public class GarbageCollection {
	@Override
	public void finalize() {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {

		GarbageCollection s1 = new GarbageCollection();
		System.out.println(s1.hashCode());
		s1 = null;

		System.gc();
//   String s4= s3.intern();
//   System.out.println(s4);

	}

}
