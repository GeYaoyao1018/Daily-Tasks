package com.heima.genetic;

import com.heima.bean.Student;
import com.heima.bean.Tool;
import com.heima.bean.Worker;

public class Demo2_Genetic {

	/**
	 * * ���͵�����:ͨ��Objectת����������
	* ���ڵ�Object���Ϳ��Խ�������Ķ������ͣ�������ʵ�ʵ�ʹ���У���������ת�������⡣Ҳ�ʹ���������������Java�ṩ�˷�������������ȫ���⡣
	 */
	public static void main(String[] args) {
        Tool t = new Tool();                                                        //�������߶���                   
        t.setObj(new Student("����",23));
        
        Worker w = (Worker) t.getObj();                             //����ת��
        System.out.println(w);
	}

}
