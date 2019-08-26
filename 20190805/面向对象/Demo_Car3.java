class Demo_Car3	{	 
	public static void main(String[] args) {
      // Car  c1 = new Car();
	  /* c1.color = "red";
	   c1.num = 8;
	   c1.run();*/
	   //method(c1);

	   method(new Car());      //匿名对象可以当做参数传递

	   //Car c2 = new Car();
	   //method(c2);

	   method(new Car());



	}

	//抽取方法,提高代码的复用性
	public static void method(Car cc) {
           cc.color = "red";
		   cc.num = 8;
		   cc.run();
	}
}

 class Car  {
	 String color;          //颜色
	 int num;              //轮胎数

	 public void run()  {
		 System.out.println(color + "..." + num);
	 }
 }
