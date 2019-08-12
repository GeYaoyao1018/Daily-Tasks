package com.heima.StringBuffer;

public class Demo2_StringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		 
		System.out.println(sb.toString());      //StringBuffer 类中重写了tostring方法,显示的是对象中的属性
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
}
}
