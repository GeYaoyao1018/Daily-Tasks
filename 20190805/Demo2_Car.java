/*A:什么是匿名对象
	* 没有名字的对象 
* B:匿名对象应用场景
	* a:调用方法，仅仅只调用一次的时候。
		* 那么，这种匿名调用有什么好处吗?
			* 节省代码 
		* 注意：调用多次的时候，不适合。匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。
	* b:匿名对象可以作为实际参数传递
* C:案例演示
	* 匿名对象应用场景
*/

  class Demo2_Car {  
	public static void main(String[] args) {
		Car c1 = new Car();   //创建有名字的对象
		c1.run();

		new Car().run();     //匿名对象调用方法
		new Car().run();      //匿名对象只适合对方付的一次调用,因为调用多次就会产生多个对象,不如使用有名字的对象

	}
}
 
 class Car {
	 String color;    //颜色
	 int num;         //轮胎数

	 public void run()  {
		 System.out.println("车运行");
			 }
 }
