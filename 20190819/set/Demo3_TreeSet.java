package com.heima.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.Person;

public class Demo3_TreeSet {

	/**
	 * TreeSet ��������������Ԫ�ؽ��������,ͬ��Ҳ���Ա�֤Ԫ�ص�Ψһ
	 * compared to ����0��ʱ�򼯺���ֻ��һ������
	 * compared to ����������ʱ�򼯺�����ô����ôȡ
	 */
	public static void main(String[] args) {
          //demo1();
		//demo2();  
		//demo3();
		//demo4();
		//����;���ַ������ճ�������
		TreeSet<String> ts = new TreeSet<>();
		ts.add("aaaaaaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");
		System.out.println(ts);
		
	}

	private static void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("zhangsan",23));
		ts.add(new Person("lisi",24));
		ts.add(new Person("wangwu",25));
		ts.add(new Person("zhaoliu",26));
		ts.add(new Person("zhouqi",27));
		System.out.println(ts);
	}

	private static void demo3() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����",23));
		ts.add(new Person("����",13));
		ts.add(new Person("����",43));
		ts.add(new Person("����",33));
		System.out.println(ts);
	}

	private static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����",23));
		ts.add(new Person("����",13));
		ts.add(new Person("����",43));
		ts.add(new Person("����",43));
		
		System.out.println(ts);
	}

	private static void demo1() {
		TreeSet<Integer>  ts = new TreeSet<> ();
          ts.add(3);
          ts.add(3);
          ts.add(2);
          ts.add(2);
          ts.add(1);
          ts.add(1);
          System.out.println(ts);
	}
}
      class CompareBylen  implements  Comparator<String> {

		@Override
		public int compare(String s1, String s2) {           //�����ַ����ĳ��ȱȽ�
			int num = s1.length() - s2.length();                   //����Ϊ��Ҫ����
			return num == 0 ? s1.compareTo(s2) : num;    //����Ϊ��Ҫ����
		}
    	  
      }
