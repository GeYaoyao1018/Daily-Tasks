package com.heima.test;

import java.io.File;

public class Test2_delete {

	/**
	 * �Ӽ��̽���һ���ļ���·��,ɾ�����ļ���
	 */
	public static void main(String[] args) {
		File dir = Test1.getDir();
	}
	public static void deleteFile(File dir)     {
		File[] subFiles   = dir.listFiles();
		for (File subFile : subFiles)    {
			if(subFile.isFile())    {
				subFile.delete();
			} else {
				deleteFile(subFile);
			}
		}

	}

}
