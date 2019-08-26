package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

public class Test_copy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File src = Test1.getDir();
		File dest = Test1.getDir();
		if(src.equals(dest))  {
			 System.out.println("目标文件夹是源文件夹的子文件夹");
		}else {
		copy(src,dest);
	}
	}
		
	public static void copy(File src,File dest)  throws  IOException  {
	File newDir = new File(dest,src.getName());
	newDir.mkdir();
	File[] subFiles  = src.listFiles();
	
	for(File subFile  : subFiles)  {
		if(subFile.isFile())   {
			BufferedInputStream bis = new BufferedInputStream(new BufferedInputStream(subFile));
		     BufferedOutputStream bos = new BufferedOutputStream(new File(newDir,subFile.getName()));
		int b;
		while((b = bis.read()) != -1)  {
			bos.write(b);
			
		}
		bis.close();
		bos.close();
		}else {
			copy(subFile,newDir);
			
		}
					
	}
		

	}

}
