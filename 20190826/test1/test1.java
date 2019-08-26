package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class test1 {

	/**
	 * 将一个文本文档上的文本进行反转,第一行与倒数第一行交换,第二行与倒数第二行交换
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//创建输入输出对象
		BufferedReader br = new BufferedReader (new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("revzzz.txt"));
		//创建集合对象
		ArrayList<String> list = new ArrayList<>();
		//将读到的数据存储在集合中
		String line;
		while((line = br.readLine())   != null)    {
			list.add(line);
		}
		
		//倒看遍历集合将数据写到文件上
		for(int i = list.size()   - 1; i >=0; i--)  {
			bw.write(list.get(i));
			bw.newLine();
			
			//关流
			br.close();
			bw.close();	
			
		}
	}

}
