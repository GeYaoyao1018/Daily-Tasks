package com.heima.test;

import java.io.File;

public class Test4 {

	/**
	 * 实现层级打印
	 */
	public static void main(String[] args) {
         File dir = Test1.getDir();
         printLev(dir,0);
	}

	public static void printLev(File dir,int lev) {
			File[] subFiles  = dir.listFiles();
			for(File subFile : subFiles) {
				for(int i = 0; i  <= lev; i++)   {
					System.out.println("\t");
				}
				System.out.println(subFile);
				if(subFile.isDirectory()) {
					printLev(subFile,lev + 1);	
	}
	
			}
			
		}
	}
	
