package com.heima.array;

import java.util.Arrays;

public class Demo2_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         int [] arr = {33,22,11,44,66,55};
         System.out.println(Arrays.toString(arr));    //����ת��Ϊ�ַ���
         
         Arrays.sort(arr);                                               //����
         System.out.println(Arrays.toString(arr));
         
         int[] arr2 = {11,22,33,44,55,66};                      //���ַ�������
         
         System.out.println(Arrays.binarySearch(arr2 , 22));
         System.out.println(Arrays.binarySearch(arr2, 66));
         System.out.println(Arrays.binarySearch(arr2, 99));
         
         
	}

}
