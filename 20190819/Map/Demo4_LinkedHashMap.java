package com.heima.Map;

import java.util.LinkedHashMap;

public class Demo4_LinkedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("����", 23);
		lhm.put("����", 24);
		lhm.put("����", 25);
		lhm.put("����", 26);
		
		System.out.println(lhm);
	}
	}
