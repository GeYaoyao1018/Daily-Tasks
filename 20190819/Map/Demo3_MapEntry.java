package com.heima.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_MapEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      Map<String,Integer> map = new HashMap<>();
      map.put("张三", 23);
      map.put("李四", 24);
      map.put("王五", 25);
      map.put("赵六", 26);
      
   /*   Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
      //获取每一个对象
      Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
      while (it.hasNext())  {
    	  Map.Entry<String, Integer> en = it.next();
    	  String key = en.getKey();
    	  Integer value = en.getValue();
    	  System.out.println(key + "=" + value);
      } */
      
      for (Entry<String,Integer> en : map.entrySet())  {
    	  System.out.println(en.getKey() + "=" + en.getValue());
    	       }
	}

}
