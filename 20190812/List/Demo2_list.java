package com.heima.List;

import java.util.ArrayList;
import java.util.List;

import com.heima.bean.Student;

public class Demo2_list {

	/*
	 * 通过size()和get()方法结合使用遍历。
	 */
	public static void main(String[] args) {
      List list =new ArrayList();
      list.add(new Student("张三", 23));
      list.add(new Student("李四", 24));
      list.add(new Student("王五", 25));
      list.add(new Student("赵六", 26));
      
      for(int i = 0; i < list.size(); i++) {
    	  System.out.println(list.get(i));
      }
        
	}

}
