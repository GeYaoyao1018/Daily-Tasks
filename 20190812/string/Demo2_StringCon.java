package com.heima.string;

public class Demo2_StringCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    String s1 = new String();
    System.out.println(s1);
    
     byte [] arr1 = {97,98,99};
     String s2 = new String (arr1);                   //解码,将计算机读的懂的转化成我们读的懂的
     System.out.println(s2);
     
     byte[] arr2 = {97,98,99,100,101,102};  
     String s3 = new String(arr2,2,3);                     //将arr2字节数组从2索引开始转化3个
     System.out.println(s3);
     
     char[] arr3 = {'a','b','c','d','e'};       //将字符数组转化成字符串
     String s4 = new String(arr3);
     System.out.println(s4);
     
     String s5 = new String(arr3,1,3);    //将arr3字符数组,从1索引开始转化3个
     System.out.println(s5);
     
     String s6 = new String("heima");
     System.out.println(s6);
     
     
	}

}
