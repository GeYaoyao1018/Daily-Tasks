package com.heima.string;

public class Demo6_StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Demo1();
	   //	Demo2();
		//Demo3();
		String s1 = "heima";
		String s2 = "chengxuYUAN";
		String s3 = s1.toLowerCase();
		String s4 = s2.toUpperCase();
		
		System.out.println(s3 + s4);
		System.out.println(s3.concat(s4));
		
		
		 
		 
		
		}

	private static void Demo3() {
		char[] arr = {'a','b','c'};
		String s = String.valueOf(arr);
		System.out.println(s);
		
		 String s2 = String.valueOf(100);
		 System.out.println(s2+100);
	}

	private static void Demo2() {
		String s = "heima";
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++)  {
			System.out.print(arr[i] + " ");
		}
	}

	private static void Demo1() {
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for  (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		String s2 = "ÄãºÃÄãºÃ";
		byte[] arr2 = s2.getBytes();
		for  (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		
			
		}
	}
}

