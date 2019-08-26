package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * ����:1,�Ӽ��̽���һ���ļ���·��,ͳ���ļ��д�С
	 * ����:��������¼�����
	 * ����һ������ѭ��
	 * ������¼��Ľ���洢��װ��File����
	 * ��File�����ж�
	 * ���ļ���·��������з���
	 */
	public static void main(String[] args)    {
		File dir = new File("F:");
		System.out.println(dir.length());
		
	}
	public static File getDir()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·��:");
		while(true)     {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists())   {
				System.out.println("��¼����ļ��в�����,������һ���ļ���·��:");
			} else if(dir.isFile())    {
				System.out.println("��¼������ļ�·��,������һ���ļ���·��:");
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
