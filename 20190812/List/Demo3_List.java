package com.heima.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {

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
		
 ListIterator  lit = list.listIterator();                 //获取迭代器
 while(lit.hasNext())  {                                     //判断集合中是否有元素
	 String str = (String) lit.next();                      //向下转型             
	 if("world".equals(str)) {
		 lit.add("javaee");                                     //遍历的同时在增加元素
		 	 }
 }
 
 System.out.println(list);
	}
}
