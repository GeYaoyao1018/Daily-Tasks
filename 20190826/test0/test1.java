package com.heima.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test1 {

	/**
	 * @param args 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//read(byte[] b) 是字节输入流的方法,创建FileInputStream,关联a.txt
		FileInputStream fis = new FileInputStream("aaa.txt");
		//创建内存输出流,将读到的数据写到内存输出流中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//创建字节数组,长度为5
		byte[] arr = new byte[5];
		int len;
		while ((len = fis.read(arr)) != -1)  {
			baos.write(arr,0,len);
			//System.out.println(new String(arr,0,len));
			System.out.println(baos);
			fis.close();	
		}
	}

}
