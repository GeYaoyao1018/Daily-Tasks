package com.heima.object;

import com.heima.bean.Student;




public class Demo1_HashCod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object obj1  = new Object();
		int hashCode = obj1.hashCode();
		System.out.println(hashCode);
		
		Student s1 = new  Student("����",23);
		Student s2 = new  Student("����",24);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
}
}
