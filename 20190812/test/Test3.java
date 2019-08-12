package com.heima.test;

public class Test3 {

	/*
	 *案例演示
	 *需求:统计ABCDEabcde12345!@#$%^  这个字符串的大写字母,小写字母,数字及其他符号出现的次数.
	*/
	public static void main(String[] args) {
		String s = "ABCDEabcde123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		
		//1,获取每一个字符,通过for循环遍历
		for(int i = 0; i < s .length(); i++) {
			char c = s.charAt(i);
			//2,判断字符是否在这个范围内
			if(c >= 'A' && c <= 'Z')  {
				big++;
			}else if (c >= 'a' && c <= 'z') {
				small++;
			}else if (c >= '0' && c <='9') {
				num++;
			}else {
				other++;
			}
		}
		System.out.println(s + "中大写字母有:" + big + "个, 小写字母有:" + small + "个,数字字符: " + num + "个,其他字符:''" +
				 + other + "个");
}
}
