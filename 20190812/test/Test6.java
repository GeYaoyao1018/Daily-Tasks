package com.heima.test;

import java.util.Scanner;

public class Test6 {

	/**
	 * 字符反转
	 */
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);     //创建键盘录入对象
      System.out.println("请输入一个字符串");
      String line = sc.nextLine();                            //将字符串转换为字符数组
      
      char[] arr = line.toCharArray();
      
      String s = "";
      for(int i = arr.length - 1; i >= 0; i--) {       //倒着遍历字符数组
    	  s = s + arr[i];                                                  //拼接成字符串
      }
      
      System.out.println(s);
      }
      
	}

