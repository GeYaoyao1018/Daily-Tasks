 class Demo2_Interface {	
	 public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		System.out.println(Inter.num);
	}
}




interface Inter {
	final int num = 10;

	//public Inter() {}             接口中没有构造方法

	//public void print()  {         接口中不能定义非抽象方法
 
  abstract void print();

}

class Demo implements Inter {
	public void print() {
		//num = 20
		System.out.println(num);
	}

	public Demo () {
		super();

	}
}