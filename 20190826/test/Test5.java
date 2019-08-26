package com.heima.test;

public class Test5 {

	/**
	 * ì³²¨ÄÇÆõ
	 */
	public static void main(String[] args) {
       //demo1();
       System.out.println(fun(8));
	}

	private static void demo1() {
		int[] arr = new  int[8];
		   arr[0] = 1;
		   arr[1] = 1;
		   for (int i = 2; i < arr.length; i ++)    {
			   arr[i]  = arr[i - 2] + arr[i - 1];   
		   }
		   System.out.println(arr[arr.length - 1]);
	}
	
	public static int fun(int num)  {
		if(num == 1 || num == 2)   {
			return 1;
		} else {
			return fun(num - 2) + fun(num - 1);
		}
	}

}
