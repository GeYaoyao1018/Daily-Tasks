package com.heima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo3_test3 {

	/**
	 * ������¼��Ķ��󿽱�����ǰĿǰ¼�µ�text.txt�ļ�,����¼�����ݵ�����quitʱ���˳�
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//�������������,����text.txt�ļ�
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
