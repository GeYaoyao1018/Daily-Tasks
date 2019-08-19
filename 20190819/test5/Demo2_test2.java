package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo2_test2 {

	/**
	 * @param args
	 * ����¼�뿽���ļ�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b= bis.read()) != -1)  {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	public static File getFile()   {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ��е�·��:");
		while(true)  {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists())   {
				System.out.println("��¼����ļ�·��������,����������:");
			} else if(file.isDirectory())   {
				System.out.println("��¼������ļ�·��,����������");
			}  else {
				return file;
				
			}
		}
	}

}
