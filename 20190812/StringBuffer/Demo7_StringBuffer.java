package com.heima.StringBuffer;

public class Demo7_StringBuffer {

	/**
	 * String ��StringBuffer��Ϊ��������
	 */
	public static void main(String[] args) {
		String s = "heima";
		System.out.println(s);
		//change(s);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer();
		sb.append("heima");
		System.out.println(sb);
		change(sb);
		System.out.println();
	}
	
	public static void change(StringBuffer sb) {
		sb.append("itcast");
	}
	
}
