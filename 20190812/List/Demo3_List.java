package com.heima.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
 ListIterator  lit = list.listIterator();                 //��ȡ������
 while(lit.hasNext())  {                                     //�жϼ������Ƿ���Ԫ��
	 String str = (String) lit.next();                      //����ת��             
	 if("world".equals(str)) {
		 lit.add("javaee");                                     //������ͬʱ������Ԫ��
		 	 }
 }
 
 System.out.println(list);
	}
}
