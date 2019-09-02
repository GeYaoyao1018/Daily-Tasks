package com.heima.reflect;

public class Demo2_Template {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			System.out.println("x");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start); */
	}

}

abstract class GetTime {
	public  void getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		
	}

	private void code() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println("x");
		}
	}
}
