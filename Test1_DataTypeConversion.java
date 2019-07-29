class Test1_DataTypeConversion {
	public static void main(String[] args) {
		byte b1 = 3;
		byte b2 = 4;
		//byte b3 = b1 + b2;  有可能损失精度

       //byte b4 = 3 + 4;    //java编译器有常量优化机制
	   System.out.println(b4);
	   
    }
}