package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test4 {

	/**
	 * 1,����һ��list����,���洢�ظ���������ַ���
	 * 2,���巽�������������ظ�
	 * 3,��ӡList����
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffff");
		list.add("heima");
		list.add("itcast");
		list.add("bbb");
		list.add("aaa");
		
		sort(list);
		System.out.println(list);
	}

	public  static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
		};

