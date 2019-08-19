package com.heima.bean;

public class Person  implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person() {
		super();
		}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.name.equals(p.name)  && this.age ==p.age;
		
	}

	
	public int hashCode() {
		return 10;

	}

	/*@Override
	//按照姓名
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);
		return num == 0 ? this.age - o.age : num;
	
	} */

	/* @Override
	 //按照姓名排序
	public int compareTo(Person o) {
		int num = this.age - o.age;
		return num == 0 ? this.name.compareTo(o.name)  : num;
	} */
	 
	public int compareTo(Person o)   {
		int length = this.name.length() - o.name.length();
		int num = length == 0 ? this.name.compareTo(o.name) : length;
		return num == 0 ? this.age - o.age : num;
			}	
}
