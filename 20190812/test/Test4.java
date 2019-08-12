package com.heima.test;

public class Test4 {

	/**
	 把一个字符串的首字母转成大写,其余为小写
	 */
	public static void main(String[] args) {
		  String s = "woaiHEImaniaima";
		  String s2 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
           System.out.println(s2);
	}

}
