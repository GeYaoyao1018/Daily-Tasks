package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Chinese {

	/**
	 * �ֽڶ�ȡ���ĵ�����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		fos.write("�Ҷ�����,�㲻Ҫƭ��".getBytes());
		fos.write("\r\n".getBytes());
		fos.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("yyy.txt");
		byte [] arr = new byte[4];
		int len;
		while ((len = fis.read(arr)) != -1 )	  {
			System.out.println(new String (arr,0,len));
				}
         fis.close();
	}

}
