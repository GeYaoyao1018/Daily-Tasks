package com.heima.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

	/**
	 * Map���ϵĹ���
	 */
	public static void main(String[] args) {
           //demo1();
		//demo2();
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����",25);
		map.put("����",26);
		
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());		
	}
private static void demo2() {
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����",25);
		map.put("����",26);
		
		//Integer value = map.remove("����");      //���ݼ�ɾ��Ԫ�ط��ض�Ӧ��ֵ
		//System.out.println(value);
		System.out.println(map.containsKey("����"));	 //�ж��Ƿ�������ļ�
		System.out.println(map.containsKey(100));     //�ж��Ƿ���������ֵ
		System.out.println(map);
	}

	private static void demo1() {
		Map<String,Integer> map = new HashMap<>();
           Integer i1  = map.put("����", 23);
           Integer i2 = map.put("����",24);
           Integer i3 = map.put("����", 25);
           Integer i4 = map.put("����",26);
           System.out.println(map);
           System.out.println(i1);
           System.out.println(i2);
           System.out.println(i3);
           System.out.println(i4);
	}

}
