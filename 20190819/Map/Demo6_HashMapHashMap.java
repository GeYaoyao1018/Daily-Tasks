package com.heima.Map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo6_HashMapHashMap {

	/**
	 * 集合嵌套集合
	 */
	public static void main(String[] args) {
      //定义88期基础班
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("张三",23), "北京");
		hm88.put(new Student("李四",24), "北京");
		hm88.put(new Student("王五",25), "上海");
		hm88.put(new Student("赵六",26), "广州");
		
		   //定义99期基础班
				HashMap<Student, String> hm99 = new HashMap<>();
				hm99.put(new Student("唐僧",1023), "北京");
				hm99.put(new Student("孙悟空",1024), "北京");
				hm99.put(new Student("猪八戒",1025), "上海");
				hm99.put(new Student("沙和尚",1026), "广州");
				
				//定义双元课堂
				
				HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
				hm.put(hm88, "第88期基础班");
				hm.put(hm99, "第99期基础班");
				
				//遍历双列集合
				for(HashMap<Student,String> h: hm.keySet())   {
					String value = hm.get(h);
					for(Student key : h.keySet())  {
						String value2 = h.get(key);
						System.out.println(key + "=" + value2 + "=" + value);
										}
				}
		
	}

}
