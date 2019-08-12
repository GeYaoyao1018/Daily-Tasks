package com.heima.object;

import com.heima.bean.Student;

public class Demo2_GetClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student("уехЩ",23);
		Class clazz = s.getClass();
		String name = clazz.getName();
		System.out.println(name);
	}
}
