package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_copy {

	/**
	 * ¿½±´Í¼Æ¬
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
          //Demo1();
		FileInputStream fis = new FileInputStream("2.png");
        FileOutputStream fos = new FileOutputStream("copy.png");
        //int len = fis.available();
        //System.out.println(len);
        
        byte[] arr= new byte[fis.available()];
        fis.read(arr);
        fos.write(arr);
        
        fis.close();
        fos.close();
        
        
        
          
          
	}

	private static void Demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("2.png");
          FileOutputStream fos = new FileOutputStream("copy.png");
          int b ;
          while ((b = fis.read()) != -1)  {
          fos.write(b);
          }
          
          fis.close();
          fos.close();
	}

}
