package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_test {

	/**
	 * 将写出的字节异或成一个数,这个数就是秘钥,解密的时候再次异或就行了
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
