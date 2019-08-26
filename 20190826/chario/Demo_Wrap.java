package com.heima.chario;

public class Demo_Wrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HeiMaStudent hms = new HeiMaStudent(new Student());
		hms.code();
		
	}	

	}

	interface Coder {
		public void code();
		
	}
	class Student implements Coder {

		@Override
		public void code() {
			System.out.println("javase");
			System.out.println("javaweb");
		}
		
	}
	class HeiMaStudent implements Coder  {
		//��ȡ��װ���������
      private Student s;                    //��ȡѧ������
      
      //�ڹ��췽���д��뱻װ����Ķ���
      public HeiMaStudent(Student s)   {
    	  this .s = s;
      }
      
      //�����еĹ��ܽ�������
		@Override
		public void code() {
			s.code();
			System.out.println("ssh");
			System.out.println("���ݿ�");
			System.out.println("������");
		}
	}

