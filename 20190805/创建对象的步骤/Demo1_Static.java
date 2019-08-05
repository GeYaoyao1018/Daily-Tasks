  class Demo1_Static {	
	 public static void main(String[] args) {
	 Person p1 = new Person();   //创建对象
	 p1.name = "苍老师";          //调用姓名属性并赋值
	 p1.country = "日本";        //调用国籍属性并赋值

     Person p2 = new Person();   //创建对象
	 p2.name = "小泽老师";          //调用姓名属性并赋值
	 //p2.country = "日本";        //调用国籍属性并赋值
	 p1.speak();
	 p2.speak();

	}
}




class Person {
	String name;          //姓名
	static String country;         //国籍

	public void speak() {          //说话的方法
		System.out.println(name + "..." + country);
	}
}