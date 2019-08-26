package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo4_LineNumberReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader inr = new LineNumberReader(new FileReader("zzz.txt"));
		String line;
		inr.setLineNumber(100);
		while((line = inr.readLine())  != null)    {
			System.out.println(inr.getLineNumber() + ":"  + line);
		}
		inr.close();
	}

}
