package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo1_Reflect {
	public static void main(String[] args) throws Exception {
	/*	//用多态
		//Juicer j = new Juicer();
	//	j.run(new Apple());
		j.run(new Orange());
		} */
	BufferedReader br = new BufferedReader(new FileReader("config.txt"));
	Class clazz = Class.forName(br.readLine());
	Fruit f = (Fruit) clazz.newInstance(); 
	Juicer j = new Juicer();
	j.run(f);
}
}
interface Fruit {
	public void squeeze();
}
class Apple implements Fruit {
	public void squeeze()  {
		System.out.println("榨出一杯苹果汁儿");
	}
}
class Orange implements Fruit {
	public void squeeze()  {
		System.out.println("榨出一杯橙子汁");
	}
}

class Juicer  {
	/*public void run(Orange o)  {
		o.squeeze();
	}
	public void run(Apple a)  {
	a.squeeze();
		
	}*/
	public void run(Fruit  f)  {
		f.squeeze();
	}
}
