package com.heima.thread;

public class Demo1_Singleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     // Singleton s1 = Singleton.s;                   //成员变量私有,不能通过类名,调用
      //Singleton s2 = Singleton.s;
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
      System.out.println(s1 ==s2);
	}
}

//饿汉式
/*class Singleton  {
	//私有构造方法,其他类不能访问该构造方法了
	private Singleton()  {}
	//创建本类对象
	public static Singleton s = new Singleton();
	//对外提供公共的访问方法
	public static Singleton getInstance()   {        //获取实例
		return s;
	}
}*/

//懒汉式
class Singleton  {
	//私有构造方法,其他类不能访问该构造方法了
	private Singleton()  {}
	//声明一个引用
	private static Singleton s ;
	//对外提供公共的访问方法
	public static Singleton getInstance()  {
		if(s == null)  {
			s = new Singleton();
		}
		
		return s ;
		
	}
}

