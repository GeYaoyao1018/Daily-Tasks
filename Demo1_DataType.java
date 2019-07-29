class Demo1_DataType {                  //DataType数据类型
	public static void main(String[] args) {
		     //数据类型
			 byte b = 10;       //占一个字节,-128 到 127
			 short s = 20;      //占两个字节
			 int i = 30;        //占四个字节 默认的数据类型
			 long x = 40;       //占八个字节			
		System.out.println(b);
        System.out.println(s);
		System.out.println(i);
		System.out.println(x);

		//浮点类型
		float f = 12.3f;       //占四个字节
		double d = 33.4;      //占八个字节 小数默认的数据类型是double
		System.out.println(f);
		System.out.println(d);

		//字符类型
		char c = 'a';
		System.out.println(c);

		//布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}

}
