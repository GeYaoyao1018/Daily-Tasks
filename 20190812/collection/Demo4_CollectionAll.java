package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_CollectionAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
	 //	demo1(c1);
	// demo2(c1);
	//	demo3(c1);
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.retainAll(c2);    //È¡½»¼¯
		System.out.println(b);
		System.out.println(c1);
}

	private static void demo3(Collection c1) {
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("b");
		boolean b = c1.containsAll(c2);
		System.out.println(b);
	}

	private static void demo2(Collection c1) {
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.removeAll(c2);
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1(Collection c1) {
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);
		System.out.println(c1);
	}

}
