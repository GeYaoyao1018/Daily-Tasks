package com.heima.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {

	/**
	 * Collections�еĳ�������
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
		// System.out.println(Collections.max(list));    //Ѱ�����ֵ
          // Collections.reverse(list);                                     //��ת
         // System.out.println(list);
           Collections.shuffle(list);                                    //����û���������ϴ��
           System.out.println(list);
	}

	private static void demo2() {
		ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("c");
		 list.add("d");
		 list.add("f");
		 list.add("g");
     System.out.println(Collections.binarySearch(list, "c"));       //����
     System.out.println(Collections.binarySearch(list, "g"));
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		 list.add("c");
		 list.add("a");
		 list.add("d");
		 list.add("d");
		 
		 System.out.println(list);
		 Collections.sort(list);                            //����������
		 System.out.println(list);
	}

}
