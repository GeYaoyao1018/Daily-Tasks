package com.heima.StringBuffer;

public class Demo1_StringBuffer {

	/**
	 * 构造方法
	 */
	public static void main(String[] args) {
         StringBuffer sb = new StringBuffer();
         System.out.println(sb.length());
         System.out.println(sb.capacity());
         
         StringBuffer sb2 = new StringBuffer(10);
         System.out.println(sb2.length());
         System.out.println(sb2.capacity());
         
         StringBuffer sb3 = new StringBuffer("heima");
         System.out.println(sb3.length());
         System.out.println(sb3.capacity());
         
        		 
	}

}
