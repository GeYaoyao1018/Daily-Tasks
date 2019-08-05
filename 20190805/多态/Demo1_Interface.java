 class  Demo1_Interface {
	public static void main(String[] args) {
	//Inter i = new Inter();	//接口不能被实例化,因为调用抽象方法没有意义
	 Inter i = new Demo();
	 i.print();

  
	}
}








interface Inter {
	public abstract void print();    //接口中的方法都是抽象的
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}

