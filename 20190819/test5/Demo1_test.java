package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_test {

	/**
	 * ��д�����ֽ�����һ����,�����������Կ,���ܵ�ʱ���ٴ���������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
   BufferedInputStream bis= new BufferedInputStream (new  FileInputStream("2.png"));
   BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.png"));
   
   int b;
   while ((b = bis.read()) != -1)  {
	   bos.write(b ^ 123);
   }
   bis.close();
   bos.close();
   }
   
	}
