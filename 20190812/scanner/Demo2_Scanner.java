package com.heima.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int j = sc.nextInt();
		System.out.println("i = " + i + ",j = " + j );
		
		System.out.println("请输入第一个字符串:");
		String line1 = sc.nextLine();
		System.out.println("请输入第二个字符串:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ", line2 = " + line2);
		
		System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.println("请输入第二个字符串");
		String line2 = sc.nextLine();
		System.out.println("i =  " + i + ", line2 = " + line2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
