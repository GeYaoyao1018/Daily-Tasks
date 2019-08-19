package com.heima.list;

import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo4_ArrayArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<ArrayList<Person>>  list = new ArrayList<>();
		ArrayList<Person> first = new ArrayList<>();
		first.add(new Person("ÑîÃİ",30));
		first.add(new Person("Àî±ù±ù",33));
		first.add(new Person("·¶±ù±ù",20));
		
		ArrayList<Person> second = new ArrayList<>();
		second.add(new Person("»ÆÏşÃ÷",31));
		second.add(new Person("ÕÔŞ±",33));
		second.add(new Person("³ÂÀ¤",32));
		
		
		list.add(first);
		list.add(second);
		
		for(ArrayList<Person> a : list) {
			for(Person p : a)   {
				System.out.println(p);
				
			}
		}
	}

}
