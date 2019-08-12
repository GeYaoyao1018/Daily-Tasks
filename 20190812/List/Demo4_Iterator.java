package com.heima.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo4_Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
		ListIterator lit = list.listIterator(); 
		while (lit.hasNext())  {
			System.out.println(lit.next());
		}
		
		System.out.println("..........");
		while(lit.hasPrevious())  {
			System.out.println(lit.previous());
		}
		
}
}
