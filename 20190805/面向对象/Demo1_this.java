/*
A:this�ؼ����ص�
	* ����ǰ��������� 
* B:������ʾ
	* this��Ӧ�ó���
	* �������ֳ�Ա�����;ֲ���������
*/




 class Demo1_this {
	  
	 public static void main(String[] args) {

		 Person p1 = new Person();    
         p1.setName("����");           //�����������Բ���ֵ
		 p1.setAge(23);
		// p1.age = 23;                //�������䲢��ֵ
		// p1.speak();                 //������Ϊ
		
	

		System.out.println(p1.getAge() + "...." + p1.getName() );
	}
 }

  class Person {
	  private String name;            //����
	  private int age;                //����

	  public void setAge(int age) {
		  if (age > 0 && age < 200) {
			 this.age = age;         ////this ��ǰ���������
		  } 
		  else {
			System.out.println("��ػ��ǰ�,�����ʺ���");

		  }
		  }

	public int getAge () {      //��ȡ����
		return age;
	}
	public void setName(String name)   {   //��������
		this.name = name;                 //this ��ǰ���������
		}
	

	public String getName() {           //��ȡ����
		return name;
	}
	  

	  }


	