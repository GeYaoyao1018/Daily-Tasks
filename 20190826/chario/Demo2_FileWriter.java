package com.heima.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
     FileWriter fw = new FileWriter("yyy.txt");
     fw.write("大家好,要努力,要坚持");
     fw.close();
	}

}
