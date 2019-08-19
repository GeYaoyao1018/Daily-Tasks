package com.heima.genetic;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo1_Genetic {

	/**
	 * ArrayList存储字符并遍历泛型版
	 */
	public static void main(String[] args) {
		//demo1();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("王五",25));
		list.add(new Person("赵六",26));
		
        Iterator<Person> it = list.iterator();
        while(it.hasNext())  {
        	Person p = it.next();
        	System.out.println(p.getName() + "......" + p.getAge());
        }
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String>  it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
