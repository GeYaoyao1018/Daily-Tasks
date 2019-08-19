package com.heima.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.Person;

public class Demo3_TreeSet {

	/**
	 * TreeSet 集合是用来对象元素进行排序的,同样也可以保证元素的唯一
	 * compared to 返回0的时候集合中只有一个集合
	 * compared to 返回整数的时候集合中怎么存怎么取
	 */
	public static void main(String[] args) {
          //demo1();
		//demo2();  
		//demo3();
		//demo4();
		//需求;将字符串按照长度排序
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
		ts.add(new Person("张三",23));
		ts.add(new Person("李四",13));
		ts.add(new Person("王五",43));
		ts.add(new Person("赵六",33));
		System.out.println(ts);
	}

	private static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三",23));
		ts.add(new Person("李四",13));
		ts.add(new Person("王五",43));
		ts.add(new Person("赵六",43));
		
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
		public int compare(String s1, String s2) {           //按照字符串的长度比较
			int num = s1.length() - s2.length();                   //长度为主要条件
			return num == 0 ? s1.compareTo(s2) : num;    //内容为次要条件
		}
    	  
      }
