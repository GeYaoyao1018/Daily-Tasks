package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo4_ObjectInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	//demo1();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
	      ArrayList<Person> list = (ArrayList<Person>)  ois.readObject();
	      
	      for (Person person : list)    {
	    	  System.out.println(person);
	      }
	      ois.close();
	}

	private static void demo1() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}

}
