package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4_ArrayCopy {

	/**
	 * @param args
	 * 第三种拷贝
	 * 定义小数组
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
    //  FileInputStream fis = demo2();
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileInputStream fos = new FileInputStream("yyy.txt");
		
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			//fos.write(arr,0,len);
		}
	
      fis.close();
      fos.close();
      }

	private static FileInputStream demo2() throws FileNotFoundException,
			IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		  byte []  arr = new byte[2];
		  int a = fis.read(arr);
		 
		  System.out.println(a);
		    for (byte b : arr) {
			  System.out.println(b) ;
		  }
		  
		  int c = fis.read(arr);
		  System.out.println(c);
		  for (byte b : arr)  {
			  System.out.println(b);
		  }
		return fis;
	}
      
}
