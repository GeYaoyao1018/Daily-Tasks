package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * 需求:1,从键盘接受一个文件夹路径,统计文件夹大小
	 * 分析:创建键盘录入对象
	 * 定义一个无限循环
	 * 将键盘录入的结果存储封装成File对象
	 * 对File对象判断
	 * 将文件夹路径对象进行返回
	 */
	public static void main(String[] args)    {
		File dir = new File("F:");
		System.out.println(dir.length());
		
	}
	public static File getDir()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径:");
		while(true)     {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists())   {
				System.out.println("您录入的文件夹不存在,请输入一个文件夹路径:");
			} else if(dir.isFile())    {
				System.out.println("您录入的是文件路径,请输入一个文件夹路径:");
			}  else {
				return dir;	
			}
		}
	}
	public static long getFileLength(File dir)    {
		long len = 0;
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles)   {
			if(subFile.isFile())     {
				len = len + subFile.length();
			}else {
			len =	len + getFileLength(subFile);
			}
		}
		return len;
		
	}
}
