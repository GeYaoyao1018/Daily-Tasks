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
		//read(byte[] b) ���ֽ��������ķ���,����FileInputStream,����a.txt
		FileInputStream fis = new FileInputStream("aaa.txt");
		//�����ڴ������,������������д���ڴ��������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//�����ֽ�����,����Ϊ5
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
