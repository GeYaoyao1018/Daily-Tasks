package com.heima.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
           FileInputStream fis = new FileInputStream("2.png");
           FileOutputStream  fos = new FileOutputStream("copy.png");
           BufferedInputStream bis = new BufferedInputStream(fis);
           BufferedOutputStream bos = new BufferedOutputStream(fos);
           
           int b;
           while ((b= bis.read()) != -1)  {
        	   bos.write(b);
        	}
           
           bis.close();
           bos.close();           
	}

}
