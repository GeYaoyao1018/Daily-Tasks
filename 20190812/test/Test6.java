package com.heima.test;

import java.util.Scanner;

public class Test6 {

	/**
	 * �ַ���ת
	 */
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);     //��������¼�����
      System.out.println("������һ���ַ���");
      String line = sc.nextLine();                            //���ַ���ת��Ϊ�ַ�����
      
      char[] arr = line.toCharArray();
      
      String s = "";
      for(int i = arr.length - 1; i >= 0; i--) {       //���ű����ַ�����
    	  s = s + arr[i];                                                  //ƴ�ӳ��ַ���
      }
      
      System.out.println(s);
      }
      
	}

