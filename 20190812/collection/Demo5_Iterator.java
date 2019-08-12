package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.heima.bean.Student;

public class Demo5_Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     //demo1();
		Collection c = new ArrayList();
		 c.add(new Student("张三",23));
		 c.add(new Student("李四",24));
		 c.add(new Student("王五",25));
		 //cc.add(new Student("赵六",26));
		 
		 Iterator it = c.iterator();
		 while(it.hasNext())  {
			 System.out.println(it.next());
		 }
		 }
     

	private static void demo1() {
		Collection c = new ArrayList();
		 c.add("a");
		 c.add("b");
		 c.add("c");
		 c.add("d");
		 
		 Iterator it = c.iterator();
		 boolean b1 = it.hasNext();
		 Object obj1 = it.next();
		 System.out.println(b1);
		 System.out.println(obj1);
		 
		 boolean b2 = it.hasNext();
		 Object obj2 = it.next();
		 System.out.println(b2);
		 System.out.println(obj2);
		 	
		 
		 while(it.hasNext())  {
			 //System.out.println(it.next());
			 Student s = (Student)it.next();
			 System.out.println(s.getName () + "..." + s.getAge());
		 }
	};
     
}
