package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		//int[] arr = {11,22,33,44,55};
		//List<int []> list = Arrays.asList(arr);
		//System.out.println(list);		
		
		//demo2();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String[] arr = list.toArray(new String[10]);
		for (String string : arr) {
			System.out.println(string);
		}
		
}
	private static void demo2() {
		Integer[] arr = {11,22,33,44,55};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
	}
	private static void demo1() {
		String [] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);
		//list.add("d");
		System.out.println(list);
	}

}
