package com.heima.otherio;

import java.io.PrintStream;

import com.heima.bean.Person;

public class Demo5_PrintStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("aaa");
		PrintStream ps = System.out;          //获取标准输出流
		ps.println(9797);                                //数据通过Integer.toString()
		ps.write(97);                                        //查找两表,找到对应的a并打印
		
		
		Person p1 = new Person("张三",23);
		ps.println(p1);
		ps.close();
	
		
		

	}

}
