package com.heima.test;

import java.util.HashMap;

public class Test1 {

	/**
	 * 统计字符串中每个字符出现的次数
	 */
	public static void main(String[] args) {
      //1,定义一个需要被统计的字符的字符串
		String s = "aaaaaaaabbbbbccc";
		//将字符串转换为字符组
		char[] arr = s.toCharArray();
		//3,定义双列集合,存储字符串中字符存储在双列集合中
		HashMap<Character, Integer> hm = new HashMap<>();
		//遍历字符组获取每一个字符,并将字符存储在双列集合中
		for (char c: arr)  {
			/*if(!hm.containsKey(c))  {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
				} */
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) +1);
				//打印双列集合获取字符出现的次数
			for (Character key : hm.keySet()){
				
				System.out.println(key + "=" + hm.get(key));
				}
				
			}
		}
		
		
	}
