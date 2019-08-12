package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		//System.out.println(i);
		if(sc.hasNextInt())  {
			int i = sc.nextInt();
			System.out.println(i);
		}else {
			System.out.println("输入的类型错误");
		}
	}

	}


