package com.heima.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo7_RandomAcess {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("g.txt","rw");
          // raf.write(97);
           //int x = raf.read();
          // System.out.println(x);
		raf.seek(0);                                                                   //��ָ��λ������ָ��
		raf.write(98);
		raf.close();      
	}

}