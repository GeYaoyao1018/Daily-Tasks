  class Demo3_Student {  
	 public static void main(String[] args) {
		Student s1 = new Student();        //ʹ�ÿղι���
		s1.setName("����");                //��������
		s1.setAge(23);                     //��������

		System.out.println("�ҵ�������:" + s1.getName() + ",�ҵ�������:" + s1.getAge());//��ȡ����������
	
	    Student s2 = new Student("����",24);
		s2.show();
	
	}

}



 class Student {
	private String name;                          //����
	private int age;                              //����

	public Student() {}                           //�ղι���

	public Student(String name,int age) {        //�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {          //��������
		this.name = name;
	}

	public String Getname() {                    //��ȡ����
		return name;
	}
   
    public void setAge(int age) {            //��������
		this.age=age;
	}

	public int getAge() {                   //��ȡ����
		return age;
 }

  public void show() {
	  System.out.println("�ҵ�������:" + name + "�ҵ�������" + age);
  }
	
}
