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
	 * ��һ���ı��ĵ��ϵ��ı����з�ת,��һ���뵹����һ�н���,�ڶ����뵹���ڶ��н���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//���������������
		BufferedReader br = new BufferedReader (new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("revzzz.txt"));
		//�������϶���
		ArrayList<String> list = new ArrayList<>();
		//�����������ݴ洢�ڼ�����
		String line;
		while((line = br.readLine())   != null)    {
			list.add(line);
		}
		
		//�����������Ͻ�����д���ļ���
		for(int i = list.size()   - 1; i >=0; i--)  {
			bw.write(list.get(i));
			bw.newLine();
			
			//����
			br.close();
			bw.close();	
			
		}
	}

}
