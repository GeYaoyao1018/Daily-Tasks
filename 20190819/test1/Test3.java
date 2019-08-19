package com.heima.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/**
	 * 去除集合中的重复元素
	 */
	public static void main(String[] args) {
		//创建List集合存储若干个重复元素
		ArrayList<String>  list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		
		//单独定义方法去除重复
		getString(list);
		//打印下List集合
		System.out.println(list);
	}

     public static void getString(List<String> list) {
    	 LinkedHashSet<String>  lhs = new LinkedHashSet<>();
    	 lhs.addAll(list);
    	 list.clear();
    	 list.addAll(lhs);
     }
			}


