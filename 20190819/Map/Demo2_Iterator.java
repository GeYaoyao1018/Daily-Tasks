package com.heima.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	/**
	 * ͨ���鿴map�ļ�������ֵ
	 */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����",25);
		map.put("����",26);
		
		Integer i = map.get("����");
		System.out.println(i);
		
		//��ȡ���еļ�
		/*Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext())  {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}*/
		
		for(String key : map.keySet())   {
			System.out.println(key +"=" + map.get(key));
		}	
	}

}
