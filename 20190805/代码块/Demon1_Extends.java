class Demon1_Extends {	
	public static void main(String[] args) {
	 Cat c = new Cat();
	 c.color = "��";
	 c.leg = 4;
	 c.eat();
	 c.sleep();

	  
	  System.out.println(c.leg + "..." + c.color);


	}
}

/*
A:�̳�(extends)
	* ��������֮�������ϵ,�Ӹ����ϵ 
* B:�̳а�����ʾ��
	* ������,è��,����
	* ������������(��ɫ,�ȵĸ���)��������(�Է���˯��)
* C:������ʾ
	* ʹ�ü̳�ǰ
* D:������ʾ
	* ʹ�ü̳к�
	*/

    class Animal {
		String color;          //��ɫ
		int leg;               //������

		public void eat() {
			System.out.println("�Է�");
	}

	public void sleep() {           //˯���Ĺ���
          	System.out.println("˯��");

			}
			}

    

	class Cat extends Animal {
		String color;          //��ɫ
		int leg;               //������

		public void eat() {
			System.out.println("�Է�");
	}

	public void sleep() {           //˯���Ĺ���
          	System.out.println("˯��");

			}
			}

  class Dog   extends Animal {
		String color;          //��ɫ
		int leg;               //������

		public void eat() {
			System.out.println("�Է�");
	}

	public void sleep() {           //˯���Ĺ���
          	System.out.println("˯��");

			}
			}

			/*
			extends �Ǽ̳е���˼
			Animal�Ǹ���
			Cat��Dog ��������
			*/

