package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	/*
	 * ȥ���ظ��ַ�,��ӡ����ͬ����Щ�ַ� aaaaaaabbbbbbbbbbcccccccccccccc
	 */
	public static void main(String[] args) {
		//1,����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ���ַ�"); 
		
		//2,����HashSet����,���ַ��洢,ȥ���ظ�
		HashSet<Character>  hs = new HashSet<>();
		//3,���ַ���ת�����ַ�����,��ȡÿһ���ַ��洢��HashSet������,�Զ�ȥ���ظ�.
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
