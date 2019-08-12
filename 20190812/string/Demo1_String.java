package com.heima.string;

public class Demo1_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String  str = "abc";            //"abc"可以看作是一个字符串对象
		  str = "def";                      //当把"def"赋值给str.原来的"abc"就成了垃圾
		System.out.println(str);    //String类重写了tostring方法返回的是该对象本身
		
}

}
