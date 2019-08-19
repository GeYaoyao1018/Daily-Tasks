package com.heima.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 *
	 */
	public static void main(String[] args) throws IOException  {
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);
		//fos.write(97);
		//fos.write(98);
		//fos.write(99);
		fos.write(100);
		fos.write(101);
		fos.close();
             
	}

}
