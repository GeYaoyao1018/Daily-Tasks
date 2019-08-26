package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Demo10_Properties {

	/**
	 * @param args
	 * Properties是HashTable的子类
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//demo1();
		//demo2();
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.property"));
		//System.out.println(prop);
		prop.setProperty("tel", "18912345678");
		prop.store(new FileOutputStream("config.property"),null);
		System.out.println(prop);
		
		
		
		
		
		
	}

	private static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("张三","23");
		prop.setProperty("tel", "123344");
		
		Enumeration<String>  en = (Enumeration<String>)  prop.propertyNames();
		while(en.hasMoreElements())   {
			String key = en.nextElement();
			String value =prop.getProperty(key);
			System.out.println(key +"=" + value);
			
		}
	}

	private static void demo1() {
		Properties prop = new Properties();
		prop.put("abc",123);
		System.out.println(prop);
	}

}
