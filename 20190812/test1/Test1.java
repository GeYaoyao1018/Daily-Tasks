package com.heima.test;

public class Test1 {

	/**
	 int [] arr = {1,2,3};
	 输出结果
	 "[1,2,3]"
	 用StringBuffer的功能实现
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arrayToString(arr));

	}
	public static String arrayToString(int[] arr)  {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (int i = 0; i < arr.length; i++)  {
			if(i == arr.length -1) {
				sb.append(arr[i]).append("]");
			}else {
				sb.append(arr[i]).append(",");
			}
		}
		return sb.toString();
				
			}
		}
		
	
