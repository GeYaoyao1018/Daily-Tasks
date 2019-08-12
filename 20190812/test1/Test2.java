package com.heima.test;

import java.util.Scanner;

public class Test2 {

	/**
	 * ·´×ª
	 */
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	   String line = sc.nextLine();
	   StringBuffer sb = new StringBuffer(line);
	   sb.reverse();
	   System.out.println(sb.toString());
	}

	/*private static void demo1() {
		Scanner sc = new Scanner(System.in);
		   String line = sc.nextLine();
		   
		   StringBuffer sb = new StringBuffer(line);
		   sb.reverse();
		   System.out.println(sb.toString());
	} */

}
