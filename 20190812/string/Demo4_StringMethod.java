package com.heima.string;

public class Demo4_StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
   // Demo1();
	//	Demo2();
		
		String s1 = "heima";
		String s2 = "";
		String s3 = null;
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());
		
		
				
	}

	private static void Demo2() {
		String s1 = "ÎÒ°®heima,¹þ¹þ";
		String s2 = "heima";
		String s3 = "baima";
		String s4 = "ÎÒ°®";
		String s5 = "¹þ¹þ";
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s3));
		
		System.out.println(".....");
		System.out.println(s1.startsWith(s4));
		System.out.println(s1.startsWith(s5));
		
		System.out.println(".....");
		System.out.println(s1.endsWith(s4));
		System.out.println(s1.endsWith(s5));
	}

	private static void Demo1() {
		String s1 = "heima";
		String s2 ="heima";
		String s3 = "HeiMa";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(".......");
		
		System.out.println(s1.equalsIgnoreCase(s2));    
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
