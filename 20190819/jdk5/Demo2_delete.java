package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_delete {

	/**
	 *  普通for循环,可以删除,但是索引要--
* 迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常
* 增强for循环不能删除

	 */
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
       /* //1,创建for循环删除,索引要--
        for(int i = 0; i < list.size(); i++) {
        	if ("b".equals(list.get(i))) {
        		list.remove(i--);
        	}
        	
        }  */
         
        //迭代器删除
        Iterator<String>  it = list.iterator();
        while (it.hasNext())    {
        	if ("b".equals(it.next()))   {
        		it.remove();
        	}
        }
        
       System.out.println(list);    
       
       //3,foreach不能用来删除
	}

}
