package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
                // demo1();     
		FileReader fr = new FileReader("xxx.txt");
		int c;
		while((c = fr.read ())  != -1)     {
			System.out.print((char)c);
		}
		fr.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		 int x = fr.read();
		 System.out.println(x);
		 char c = (char)x;
		 System.out.print(c);
		 fr.close();
	}

}
