package com.heima.bean;

public class Person {
	private String name;
	private int age;
	public Person() {                //alt + shift + s +c
		super();
		}
	public Person(String name, int age) {    //alt+shift+s+o  ���ݱ����ֶ������вι���
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {               //alt +shift +s +r     ����get��set����
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	}


