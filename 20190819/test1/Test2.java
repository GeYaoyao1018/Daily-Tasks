package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	/*
	 * 去掉重复字符,打印出不同的那些字符 aaaaaaabbbbbbbbbbcccccccccccccc
	 */
	public static void main(String[] args) {
		//1,创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一行字符"); 
		
		//2,创建HashSet对象,将字符存储,去掉重复
		HashSet<Character>  hs = new HashSet<>();
		//3,将字符串转化成字符数组,获取每一人字符存储在HashSet集合中,自动去除重复.
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		
		for (char c : arr)   {
			hs.add(c);
		}
		
		for(Character ch : hs) {
			System.out.println(ch);
		}
	}
}
