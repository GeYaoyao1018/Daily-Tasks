package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	//	FileInputStream fis = demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b;
		while((b = fis.read()) != -1)  {
			System.out.println(b);
		}
		fis.close();                                                                  //关流释放资源
		
		
		
         
	}

	private static FileInputStream demo1() throws FileNotFoundException,
			IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x = fis.read();
		System.out.println(x); 
		int y = fis.read();
		System.out.println(y); 
		int z= fis.read();
		System.out.println(z);
		int a= fis.read();
		System.out.println(a);
		int b= fis.read();
		System.out.println(b);
		return fis;
	}

}
