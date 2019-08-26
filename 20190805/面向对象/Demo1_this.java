/*
A:this关键字特点
	* 代表当前对象的引用 
* B:案例演示
	* this的应用场景
	* 用来区分成员变量和局部变量重名
*/




 class Demo1_this {
	  
	 public static void main(String[] args) {

		 Person p1 = new Person();    
         p1.setName("张三");           //调用姓名属性并赋值
		 p1.setAge(23);
		// p1.age = 23;                //调用年龄并赋值
		// p1.speak();                 //调用行为
		
	

		System.out.println(p1.getAge() + "...." + p1.getName() );
	}
 }

  class Person {
	  private String name;            //姓名
	  private int age;                //年龄

	  public void setAge(int age) {
		  if (age > 0 && age < 200) {
			 this.age = age;         ////this 当前对象的引用
		  } 
		  else {
			System.out.println("请回火星吧,地球不适合你");

		  }
		  }

	public int getAge () {      //获取年龄
		return age;
	}
	public void setName(String name)   {   //设置姓名
		this.name = name;                 //this 当前对象的引用
		}
	

	public String getName() {           //获取姓名
		return name;
	}
	  

	  }


	