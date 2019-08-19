package com.heima.genetic;

import com.heima.bean.Student;
import com.heima.bean.Tool;
import com.heima.bean.Worker;

public class Demo2_Genetic {

	/**
	 * * 泛型的由来:通过Object转型问题引入
	* 早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
	 */
	public static void main(String[] args) {
        Tool t = new Tool();                                                        //创建工具对象                   
        t.setObj(new Student("张三",23));
        
        Worker w = (Worker) t.getObj();                             //向下转型
        System.out.println(w);
	}

}
