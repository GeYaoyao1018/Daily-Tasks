package com.heima.string;

public class Demo7_StringMethod {

	/**
	 * �滻
	 * ȥ�ո�
	 * �Ƚ�
	 */
	public static void main(String[] args) {
		Demo1();
		String s1 = "abc";
		String s2 = "acd";
		 int num = s1.compareTo(s2);
		 System.out.println(num);
		 
		 String s3 = "��";
		 String s4 = "��";
		int num2 = s3.compareTo(s4);
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		 System.out.println(num2);
		 
		 String s5 ="heima";
		 String s6 = "HEIMA";
		 int num3 = s5.compareTo(s6);
		 System.out.println(num3);
		 
		 int num4 = s5.compareToIgnoreCase(s6);
		 System.out.println(num4);
		 }

	private static void Demo1() {
		String s = "heima";
		String s2 = s.replace('e', 'o');
		System.out.println(s2);
		
		String s3 = s.replace("ei", "ao");
		System.out.println(s3);
	}

}
