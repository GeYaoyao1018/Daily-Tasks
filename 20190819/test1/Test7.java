package com.heima.test;

import java.util.Scanner;
import java.util.TreeSet;

import com.heima.bean.Student;

public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);        //创建键盘录入对象
           System.out.println("请输入学生成绩的格式是:姓名,语文,数学,英语");
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
        	   System.out.println("排序后的学生信息:");
        	   for (Student s : ts) {
        		   System.out.println(s);
        		   
        	   }
        	   
           }
	}

}
