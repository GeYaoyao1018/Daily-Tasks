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
		//获取被装饰类的引用
      private Student s;                    //获取学生引用
      
      //在构造方法中传入被装饰类的对象
      public HeiMaStudent(Student s)   {
    	  this .s = s;
      }
      
      //对已有的功能进行升级
		@Override
		public void code() {
			s.code();
			System.out.println("ssh");
			System.out.println("数据库");
			System.out.println("大数据");
		}
	}

