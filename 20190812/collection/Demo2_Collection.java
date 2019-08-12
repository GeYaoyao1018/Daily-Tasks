package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2_Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     Collection c = new ArrayList();
     boolean b1 = c.add("abc");
     boolean b2 = c.add(true);
     boolean b3 = c.add(100);
     boolean b5 = c.add("abc");
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);
      
      System.out.println(c.toString());
      
     
	}

}
