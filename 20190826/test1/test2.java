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
	 * ͳ��һ���ı��ַ����ֵĴ���,����¼����һ�������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//������������������
		BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
		//����˫�м��϶���TreeMap
		TreeMap<Character,Integer> tm = new TreeMap<>();
		//���������ַ��洢��˫�м�����,�洢��ʱ�����ж�,���������������ͽ�����1�洢,�������������1�洢
		int ch;
		while((ch = br.read())  != -1);
		char c = (char)ch;
		if(!tm.containsKey(c))   {
			tm.put(c, 1);
		}else {
			tm.put(c, tm.get(c) - 1);	
		}
		//�ر���
		br.close();
		//�����������
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//�������Ͻ������е�������д��times.txt��
		for(Character key : tm.keySet())  {
			bw.write(key + "=" + tm.get(key));
			bw.newLine();
		}
	}

}

