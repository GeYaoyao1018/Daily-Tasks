package com.heima.test;

import java.util.Scanner;
import java.util.TreeSet;

import com.heima.bean.Student;

public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);        //��������¼�����
           System.out.println("������ѧ���ɼ��ĸ�ʽ��:����,����,��ѧ,Ӣ��");
           TreeSet<Student > ts = new TreeSet<>(new Comparator<Student>() {
        	   });
           @Override
           public int compare(Student s1,Students2) {
        	   int num = s2.getSum - s1.getSum();
        	   return num == 0 ? 1 : num;
        	   }
           
           while(ts.size() < 5)  {
        	   String line = sc.nextLine();
        	   String[] arr = line.split(",");
        	   int chinese = Integer.parseInt(arr[1]);
        	   int math= Integer.parseInt(arr[2]);
        	   int english = Integer.parseInt(arr[3]);
        	   
        	   ts.add(new Student(arr[0],chinese,math,english));
        	   System.out.println("������ѧ����Ϣ:");
        	   for (Student s : ts) {
        		   System.out.println(s);
        		   
        	   }
        	   
           }
	}

}
