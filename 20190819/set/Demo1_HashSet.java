package com.heima.set;

import java.util.HashSet;

import com.heima.bean.Person;

public class Demo1_HashSet {

	/**
	 * set集合 无索引,不可以重复,无序
	 */
	public static void main(String[] args) {
           //demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		
		System.out.println(hs);
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
           boolean b1 = hs.add("a");
           boolean b2 = hs.add("a");
           hs.add("b");
           hs.add("c");
           hs.add("d");
           System.out.println(hs);
           System.out.println(b1);
           System.out.println(b2);
           
           for (String string : hs) {
        	   System.out.println(string);
        	   
           }
	}
	}

