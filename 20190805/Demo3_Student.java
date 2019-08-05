  class Demo3_Student {  
	 public static void main(String[] args) {
		Student s1 = new Student();        //使用空参构造
		s1.setName("张三");                //设置姓名
		s1.setAge(23);                     //设置年龄

		System.out.println("我的姓名是:" + s1.getName() + ",我的年龄是:" + s1.getAge());//获取姓名跟年龄
	
	    Student s2 = new Student("李四",24);
		s2.show();
	
	}

}



 class Student {
	private String name;                          //姓名
	private int age;                              //年龄

	public Student() {}                           //空参构造

	public Student(String name,int age) {        //有参构造
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {          //设置姓名
		this.name = name;
	}

	public String Getname() {                    //获取姓名
		return name;
	}
   
    public void setAge(int age) {            //设置年龄
		this.age=age;
	}

	public int getAge() {                   //获取年龄
		return age;
 }

  public void show() {
	  System.out.println("我的姓名是:" + name + "我的年龄是" + age);
  }
	
}
