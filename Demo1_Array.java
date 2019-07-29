class Demo1_Array {
	public static void main(String[] args) {
		/*A:为什么要有数组(容器)
	* 为了存储同种数据类型的多个值
* B:数组概念
	* 数组是存储同一种数据类型多个元素的集合。也可以看成是一个容器。
	* 数组既可以存储基本数据类型，也可以存储引用数据类型。
      */
		//int x = 10;
        // x = 20;
		//ystem.out.println("x = " + X);

		//数据类型[] 数组名 = new 数据类型[数组的长度];
		//int [] arr = new int [5];

		/*左边:
		int: 数据类型
		[]:代表的数组,几个中括号就能代表几位数组
		arr:合法的标识符

		右边:
		new: 创建新的实体或对象
		int: 数据的类型
		[]:代表的数组
		5: 代表数组的长度
		*/

     /*A:什么是数组的初始化
	* 就是为数组开辟连续的内存空间，并为每个数组元素赋予值 
* B:如何对数组进行初始化
	* a:动态初始化 只指定长度，由系统给出初始化值
		* int[] arr = new int[5]; 	
	* b:静态初始化 给出初始化值，由系统决定长度	
* C:动态初始化的格式：
	* 数据类型[] 数组名 = new 数据类型[数组长度];

	  整数类型:byte,short,int,long 默认初始化值都是0
	  浮点类型:float,double默认初始化值值都是0.0
	  布尔类型:默认初始化值为false
	  字符类型:char默认初始化值'\u0000'

	*/
    //数据类型[] 数组名 = new 数据类型[数组的长度];
	/*int [] arr = new int [5]; 
	System.out.println (arr[0]);
	arr[0] = 10;
	System.out.println (arr[0]);
	System.out.println(arr);  //[I@2013706e  I代表int类型  [代表一维数组,@固定 对应数组的地址池
    */
     
	 /* int [] arr1 = new int [3];   //创建数组,长度为3
	 int [] arr2 = new int [3];   //创建数组,长度为3

	 System.out.println (arr1);   //打印数组的地址池
      System.out.println (arr2);

	  arr1[0] = 10;              //给第一个数组中的第一个元素赋值 
	  arr2[1] = 20;             //给第二个数组中的第一个元素赋值


	 System.out.println (arr1[0]);
	 System.out.println (arr1[1]);
	 System.out.println (arr1[2]);

	 System.out.println ("....................");
     

	 System.out.println (arr2[0]);
	 System.out.println (arr2[1]);
	 System.out.println (arr2[2]); */

    

	/*
	静态初始化的格式：
	* 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
	* 简化格式：
		* 数据类型[] 数组名 = {元素1,元素2,…};
	*/
 	
    //数据类型[] 数组名 = new 数据类型[] {元素1,元素2,.....}
	//int [] arr = new int [] {11,22,33,44,55}//不允许动静结合
	int [] arr2 = {11,22,33,44,55};       //静态初始化的简写形式

	    //int [] arr;                     //声明数组引用
		//arr2 = new int [] {11,22,33,44,55};

		//int arr2;
		//arr2 = {11,22,33,44,55};         //简写形式声明和赋值在同一行

		System.out.println(arr2);
		System.out.println(arr2[4]);



	}
}
