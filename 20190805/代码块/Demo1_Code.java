 class Demo1_Code {	
	public static void main(String[] args) {
		{
			int x = 10;
			System.out.println(x);   //�޶���������������
		}
       Student s1 = new Student();
       System.out.println("...............");
	  // Student s2 = new Student("����","23");

		
	}
}


class Student {
    private String name;
	private int age;

	public Student(){
		System.out.println("�ղι���");
	}  //�޲ι���

    public Student(String name,int age) {  //�вι���
		this.name = name;
		this.age  =age;
		System.out.println("�вι���");
	}

	public void setName(String name){
		this.name = name;
	}

    public  String getName () {
		return name;
	}
 
    public void setAge(int age ){
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	{
		System.out.println("��������");

	}

}
