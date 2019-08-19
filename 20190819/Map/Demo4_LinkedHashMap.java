package com.heima.Map;

import java.util.LinkedHashMap;

public class Demo4_LinkedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("张三", 23);
		lhm.put("李四", 24);
		lhm.put("王五", 25);
		lhm.put("赵六", 26);
		
		System.out.println(lhm);
	}
	}
