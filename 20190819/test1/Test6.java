package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/**
	 * 程序启动后可以键盘输入多个整数,直到输入quit时结束,并打印所输入的整数
	 */
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

	@Override
	public int compare(Integer i1, Integer i2) {
		//int num = i2 - i1;
		int num = i2.compareTo(i1);
		return num == 0 ? 1 : num;
	}
   });
       while (true)  {
    	   String line = sc.nextLine();
    	   if ("quit".equals(line)) {
    		   break;
    		   
    	   }
    	   Integer i = Integer.parseInt(line);
    	   ts.add(i);
    	   
       }
       
       for (Integer integer : ts) {
    	   System.out.println(integer);
    	   
       }
	}

}
