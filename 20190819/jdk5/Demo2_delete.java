package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_delete {

	/**
	 *  ��ͨforѭ��,����ɾ��,��������Ҫ--
* ������,����ɾ��,���Ǳ���ʹ�õ����������remove����,�������ֲ����޸��쳣
* ��ǿforѭ������ɾ��

	 */
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
       /* //1,����forѭ��ɾ��,����Ҫ--
        for(int i = 0; i < list.size(); i++) {
        	if ("b".equals(list.get(i))) {
        		list.remove(i--);
        	}
        	
        }  */
         
        //������ɾ��
        Iterator<String>  it = list.iterator();
        while (it.hasNext())    {
        	if ("b".equals(it.next()))   {
        		it.remove();
        	}
        }
        
       System.out.println(list);    
       
       //3,foreach��������ɾ��
	}

}
