package com.heima.string;

public class Demo5_StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Demo1();
		//Demo2();
		//Demo3();
		String s = "woaiheima";
		s.substring(4);
		System.out.println(s);
		
		
		
		
	
		
	}

	private static void Demo3() {
		String s1 = "woaiheima";
		int index1 = s1.indexOf('a', 3);
		System.out.println(index1);
		
		int index2 = s1.lastIndexOf('a');
		System.out.println(index2);
		
		int index3 = s1.lastIndexOf('a',7);
		System.out.println(index3);
	}

	private static void Demo2() {
		String s1 = "heima";
		int index = s1.indexOf('e');
		System.out.println(index);
		
		int index2= s1.indexOf('z');
		System.out.println(index2);
		
		int index3 = s1.indexOf("ma");
		System.out.println(index3);
		
		int index4 = s1.indexOf("ia");
		System.out.println(index4);
	}

	private static void Demo1() {
		String s1 = "heima";
		System.out.println(s1.length());
		String s2 = "ÄãÒª¼õ·Ê,ÔìÂð";
		System.out.println(s2.length());
		
		char c =s2.charAt(5);
		System.out.println(c);
	}

}
