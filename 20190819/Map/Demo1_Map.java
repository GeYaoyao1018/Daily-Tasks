package com.heima.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

	/**
	 * Map集合的功能
	 */
	public static void main(String[] args) {
           //demo1();
		//demo2();
		Map<String,Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五",25);
		map.put("赵六",26);
		
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());		
	}
private static void demo2() {
		Map<String,Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五",25);
		map.put("赵六",26);
		
		//Integer value = map.remove("张三");      //根据键删除元素返回对应的值
		//System.out.println(value);
		System.out.println(map.containsKey("张三"));	 //判断是否传入包含的键
		System.out.println(map.containsKey(100));     //判断是否包含传入的值
		System.out.println(map);
	}

	private static void demo1() {
		Map<String,Integer> map = new HashMap<>();
           Integer i1  = map.put("张三", 23);
           Integer i2 = map.put("李四",24);
           Integer i3 = map.put("王五", 25);
           Integer i4 = map.put("赵六",26);
           System.out.println(map);
           System.out.println(i1);
           System.out.println(i2);
           System.out.println(i3);
           System.out.println(i4);
	}

}
