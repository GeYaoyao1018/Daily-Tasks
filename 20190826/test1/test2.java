package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class test2 {

	/**
	 * 统计一个文本字符出现的次数,并记录到另一个表格中
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//创建带缓冲的输入对象
		BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
		//创建双列集合对象TreeMap
		TreeMap<Character,Integer> tm = new TreeMap<>();
		//将读到的字符存储在双列集合中,存储的时候做判断,如果不包含这个键就将键和1存储,如果包含就增加1存储
		int ch;
		while((ch = br.read())  != -1);
		char c = (char)ch;
		if(!tm.containsKey(c))   {
			tm.put(c, 1);
		}else {
			tm.put(c, tm.get(c) - 1);	
		}
		//关闭流
		br.close();
		//创建输出对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//遍历集合将集合中的内容填写到times.txt中
		for(Character key : tm.keySet())  {
			bw.write(key + "=" + tm.get(key));
			bw.newLine();
		}
	}

}

