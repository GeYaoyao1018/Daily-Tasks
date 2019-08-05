 class Test1_Animal {	
	 public static void main(String[] args) {
	Cat c = new Cat("加菲",8);
	c.eat();
	c.sleep();

	JumpCat jc =new JumpCat("跳高猫",3);
	jc.eat();
	jc.sleep();
	jc.jump();
	}
}





 abstract class Animal {
	private String name;     //姓名
	private int age;         //年龄

	public Animal () {}             //空参

	public Animal(String name,int age) {      // 有参
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {    //设置姓名
		this.name = name;

	}

	public String getName() {           //获取姓名
        return name;
   }
    
	public void setAge(int age) {
		this.age =age;
	}

	public int getAge() {
		return age;
	}

  public abstract void eat();

  public abstract void sleep();

}

 interface Jumping {
	 public void jump();
 }

abstract class Cat extends Animal {
	 public Cat() {}                     //空参构造

	 public Cat (String name,int age) {   //有参构造
	      super(name,age);
		  }

      public void eat() {
		  System.out.println("猫吃鱼");

} 

 class JumpCat extends Cat implements Jumping {
	public void jump() {
		System.out.println("猫跳高");
		}

		}



}


