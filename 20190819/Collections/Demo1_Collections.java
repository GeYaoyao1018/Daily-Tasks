package com.heima.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {

	/**
	 * Collections中的常见方法
	 */
	public static void main(String[] args) {
     //demo1();
	 //	demo2();
		ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("c");
		 list.add("d");
		 list.add("g");
		 list.add("f");
		// System.out.println(Collections.max(list));    //寻找最大值
          // Collections.reverse(list);                                     //反转
         // System.out.println(list);
           Collections.shuffle(list);                                    //随机置换可以用来洗牌
           System.out.println(list);
	}

	private static void demo2() {
		ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("c");
		 list.add("d");
		 list.add("f");
		 list.add("g");
     System.out.println(Collections.binarySearch(list, "c"));       //索引
     System.out.println(Collections.binarySearch(list, "g"));
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		 list.add("c");
		 list.add("a");
		 list.add("d");
		 list.add("d");
		 
		 System.out.println(list);
		 Collections.sort(list);                            //将集合排序
		 System.out.println(list);
	}

}
