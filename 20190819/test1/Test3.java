package com.heima.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/**
	 * ȥ�������е��ظ�Ԫ��
	 */
	public static void main(String[] args) {
		//����List���ϴ洢���ɸ��ظ�Ԫ��
		ArrayList<String>  list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		
		//�������巽��ȥ���ظ�
		getString(list);
		//��ӡ��List����
		System.out.println(list);
	}

     public static void getString(List<String> list) {
    	 LinkedHashSet<String>  lhs = new LinkedHashSet<>();
    	 lhs.addAll(list);
    	 list.clear();
    	 list.addAll(lhs);
     }
			}


