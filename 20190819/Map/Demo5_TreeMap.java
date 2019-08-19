package com.heima.Map;

import java.util.Comparator;
import java.util.TreeMap;

import com.heima.bean.Student;

public class Demo5_TreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student ,String> tm = new TreeMap<>(new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
			
		});
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",13), "�Ϻ�");
		tm.put(new Student("����",33), "����");
		tm.put(new Student("����",43), "����");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student ,String> tm = new TreeMap<>();
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",13), "�Ϻ�");
		tm.put(new Student("����",33), "����");
		tm.put(new Student("����",43), "����");
		System.out.println(tm);
	}

}