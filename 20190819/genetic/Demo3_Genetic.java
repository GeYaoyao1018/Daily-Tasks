package com.heima.genetic;

public class Demo3_Genetic {

	/**
	 * 泛型定义在接口上
	 */
	public static void main(String[] args) {

	}
}
interface Inter<T>  {
	public void show(T t);
}

/*class Demo implements Inter<String> {

	@Override
	public void show(String t) {
	System.out.println(t);
	}
	}*/

class Demo<T> implements Inter<T>   {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	}



