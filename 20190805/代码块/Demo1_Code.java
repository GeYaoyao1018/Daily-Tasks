 class Demo1_Code {	
	public static void main(String[] args) {
		{
			int x = 10;
			System.out.println(x);   //限定变量的声明周期
		}
       Student s1 = new Student();
       System.out.println("...............");
	  // Student s2 = new Student("张三","23");

		
	}
}


class Student {
    private String name;
	private int age;

	public Student(){
		System.out.println("空参构造");
	}  //无参构造

    public Student(String name,int age) {  //有参构造
		this.name = name;
		this.age  =age;
		System.out.println("有参构造");
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
		System.out.println("构造代码块");

	}

}
