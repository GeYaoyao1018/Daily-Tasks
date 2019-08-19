package com.heima.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

	/**
	 * LinkedHashSet
	 * 底层是链表实现的,是Set集合中唯一能保证怎么存怎么取的集合对象
	 */
	public static void main(String[] args) {
      LinkedHashSet<String> lhs = new LinkedHashSet<>();
      lhs.add("a");
      lhs.add("a");
      lhs.add("a");
      lhs.add("a");
      lhs.add("b");
      lhs.add("c");
      
      System.out.println(lhs);    
	}

}
