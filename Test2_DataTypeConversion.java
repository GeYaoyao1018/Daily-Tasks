class Test2_DataTypeConversion {	
	public static void main(String[] args) {
		float f = 12.3f;
		long x = 12345;
		//f = x;           //隐式转换
		//System.out.println(f);

		//x=(long) f;   //强制转换
        System.out.println(x);  
		/*
		float占4个字节
		IEEE 742 规定
		32个二进制位
		0代表0
		255代表无穷大
		*/
	}
}