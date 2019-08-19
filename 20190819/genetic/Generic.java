package com.heima.genetic;

import java.util.ArrayList;
import java.util.List;

import com.heima.bean.Person;
import com.heima.bean.Student;

public class Generic {

	/**
	 *A:泛型通配符<?>
	* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
* B:? extends E
	* 向下限定，E及其子类
* C:? super E
	* 向上限定，E及其父类

	 */
	public static void main(String[] args) {
     //List<?> list = new ArrayList<Integer>();         //右边泛型不确定是,左边可以写问号
     ArrayList<Person> list1 = new ArrayList<>();
     list1.add(new Person("张三",23));
     list1.add(new Person("李四",24));
     list1.add(new Person("王五",25));
     
     ArrayList<Student> list2 = new ArrayList<>();
     list2.add(new Student ("赵六",26));
     list2.add(new Student("周七",27));
     
     list1.addAll(list2);
     System.out.println(list1);  
	}

}
