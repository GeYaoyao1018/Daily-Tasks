package com.heima.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	/**
	 * 通过查看map的键来查找值
	 */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五",25);
		map.put("赵六",26);
		
		Integer i = map.get("张三");
		System.out.println(i);
		
		//获取所有的键
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
