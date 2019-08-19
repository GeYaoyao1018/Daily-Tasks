package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1 - c2;
				return  num == 0 ? 1 : num;
				}
		});
		for (char c : arr) {
			ts.add(c);
		}
		
		for(Character c : ts) {
			System.out.println(c);
			
		}
	}

}
