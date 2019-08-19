package com.heima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo3_test3 {

	/**
	 * 将键盘录入的对象拷贝到当前目前录下的text.txt文件,键盘录入数据当遇到quit时就退出
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//创建输出流对象,关联text.txt文件
		FileOutputStream fos = new FileOutputStream("text.txt");
		while(true)   {
			String line = sc.nextLine();
			if("quit".equals(line))  {
				break;
			}
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
			}
		fos.close();
		}
	}
