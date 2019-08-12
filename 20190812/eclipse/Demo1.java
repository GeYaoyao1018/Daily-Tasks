package com.heima.eclipse;

import com.heima.animal.Cat;
import com.heima.bean.Student;

public class Demo1 {

	public static void main(String[]  args) {
     	Student  s  =  new  Student("уехЩ", 23);
	  System .out.println(s.getName()  +  "..."  + s.getAge() );
      Cat cat  = new Cat();
      cat.eat();
      cat.sleep();
	}
}
