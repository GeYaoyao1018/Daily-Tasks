package com.heima.Integer;

public class Demo1_Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int ---- String int 转化成String
		int i = 100;
		String s1 = i + "";
		String s2 = String.valueOf(i);
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		
		String s4 = Integer.toString(i);
		System.out.println(s1);
		
		//String ----int string 转化成Int
		String s ="200";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();
		
		int i5 = Integer.parseInt(s);
		
		}

}
