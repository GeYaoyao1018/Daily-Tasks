package com.heima.jdk5;

public class Demo3_ChangeableArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		//print(arr);
		print(11,22,33,44,55);
		}
	public static void print(int ...arr)    {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
	}
	}
