package com.heima.otherio;

import java.io.PrintStream;

import com.heima.bean.Person;

public class Demo5_PrintStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("aaa");
		PrintStream ps = System.out;          //��ȡ��׼�����
		ps.println(9797);                                //����ͨ��Integer.toString()
		ps.write(97);                                        //��������,�ҵ���Ӧ��a����ӡ
		
		
		Person p1 = new Person("����",23);
		ps.println(p1);
		ps.close();
	
		
		

	}

}
