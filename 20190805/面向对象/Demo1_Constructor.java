/*
 A:构造方法概述和作用
	* 给对象的数据(属性)进行初始化
* B:构造方法格式特点
	* a:方法名与类名相同(大小也要与类名一致)
	* b:没有返回值类型，连void都没有
	* c:没有具体的返回值return;
*/

class  Demo1_Constructor  {                  //Constructor 构造
 	
	public static void main(String[] args) {
		Person P = new Person();  //在一创建对象的时候,系统就帮我们调用了构造方法
       //p.Person();      //构造方法不能用对象调用
	    
		P.show();
      
	}
}


class Person {
	private String name;
	private int age;

	//构造方法
	public Person() {
		System.out.println("Hello World!");
		//return;     //构造方法也是有return语句的 

		name = "张三";
		age = 23;
}
     public void show() {
		 System.out.println(name + "..." + age);

}
}