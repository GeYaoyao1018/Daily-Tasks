/*
 A:���췽������������
	* �����������(����)���г�ʼ��
* B:���췽����ʽ�ص�
	* a:��������������ͬ(��СҲҪ������һ��)
	* b:û�з���ֵ���ͣ���void��û��
	* c:û�о���ķ���ֵreturn;
*/

class  Demo1_Constructor  {                  //Constructor ����
 	
	public static void main(String[] args) {
		Person P = new Person();  //��һ���������ʱ��,ϵͳ�Ͱ����ǵ����˹��췽��
       //p.Person();      //���췽�������ö������
	    
		P.show();
      
	}
}


class Person {
	private String name;
	private int age;

	//���췽��
	public Person() {
		System.out.println("Hello World!");
		//return;     //���췽��Ҳ����return���� 

		name = "����";
		age = 23;
}
     public void show() {
		 System.out.println(name + "..." + age);

}
}