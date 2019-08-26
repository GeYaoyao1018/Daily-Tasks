package com.heima.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int b;
		while ((b = fis.read()) != -1)   {
			baos.write(b);
		}
		byte[] arr = baos.toByteArray();
		System.out.println(new String(arr));
		
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("e.txt");
		byte[] arr = new byte[3];
		int len;
		while((len = fis.read(arr)) !=  -1 )  {
			System.out.println(new String(arr,0,len));
			
		}
		
		fis.close();
	}

}
