package com.heima.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

	/**
	 * LinkedHashSet
	 * �ײ�������ʵ�ֵ�,��Set������Ψһ�ܱ�֤��ô����ôȡ�ļ��϶���
	 */
	public static void main(String[] args) {
      LinkedHashSet<String> lhs = new LinkedHashSet<>();
      lhs.add("a");
      lhs.add("a");
      lhs.add("a");
      lhs.add("a");
      lhs.add("b");
      lhs.add("c");
      
      System.out.println(lhs);    
	}

}
