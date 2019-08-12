package com.heima.StringBuffer;

public class Demo6_StringBuffer {

	/**
	 * String和StringBuffer的相互转化
	 */
	public static void main(String[] args) {
		//demo1();
		StringBuffer sb1 = new StringBuffer("heima");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("heima");
		System.out.println(sb2);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer("heima");
		String s1 = new String(sb);
		System.out.println(s1);
		
		String s2 = sb.toString();
		System.out.println(s2);
		
		String s3 = sb.substring(0,sb.length());
		System.out.println(s3);
	}

}
