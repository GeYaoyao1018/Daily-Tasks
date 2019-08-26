package com.heima.thread;

public class Demo1_Singleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     // Singleton s1 = Singleton.s;                   //��Ա����˽��,����ͨ������,����
      //Singleton s2 = Singleton.s;
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
      System.out.println(s1 ==s2);
	}
}

//����ʽ
/*class Singleton  {
	//˽�й��췽��,�����಻�ܷ��ʸù��췽����
	private Singleton()  {}
	//�����������
	public static Singleton s = new Singleton();
	//�����ṩ�����ķ��ʷ���
	public static Singleton getInstance()   {        //��ȡʵ��
		return s;
	}
}*/

//����ʽ
class Singleton  {
	//˽�й��췽��,�����಻�ܷ��ʸù��췽����
	private Singleton()  {}
	//����һ������
	private static Singleton s ;
	//�����ṩ�����ķ��ʷ���
	public static Singleton getInstance()  {
		if(s == null)  {
			s = new Singleton();
		}
		
		return s ;
		
	}
}

