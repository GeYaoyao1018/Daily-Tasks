package com.heima.test;

import java.util.HashMap;

public class Test1 {

	/**
	 * ͳ���ַ�����ÿ���ַ����ֵĴ���
	 */
	public static void main(String[] args) {
      //1,����һ����Ҫ��ͳ�Ƶ��ַ����ַ���
		String s = "aaaaaaaabbbbbccc";
		//���ַ���ת��Ϊ�ַ���
		char[] arr = s.toCharArray();
		//3,����˫�м���,�洢�ַ������ַ��洢��˫�м�����
		HashMap<Character, Integer> hm = new HashMap<>();
		//�����ַ����ȡÿһ���ַ�,�����ַ��洢��˫�м�����
		for (char c: arr)  {
			/*if(!hm.containsKey(c))  {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
				} */
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) +1);
				//��ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
			for (Character key : hm.keySet()){
				
				System.out.println(key + "=" + hm.get(key));
				}
				
			}
		}
		
		
	}
