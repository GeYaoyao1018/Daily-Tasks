package com.heima.jdk5;

import java.util.ArrayList;

public class Demo1_foreach {

	/**
	 * A:��ǿfor����
	* �������Collection���ϵı���
* B:��ʽ��
* 
		for(Ԫ���������� ���� : �������Collection����) {
			ʹ�ñ������ɣ��ñ�������Ԫ��
		}
* C:������ʾ
	* ���飬���ϴ洢Ԫ������ǿfor����
* D:�ô�
	* �򻯱���

	 */
	public static void main(String[] args) {
           int[] arr = {11,22,33,44,55,66};
           for (int i : arr) {
        	   System.out.println(i);
           }
           
           ArrayList<String>  list = new ArrayList<>();
           list.add("a");
           list.add("b");
           list.add("c");
           list.add("d");
           
           for (String  string : list) {
        	   System.out.println(string);
        	   	}
}
}
