package com.heima.syn;

public class Demo1_Synhronized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		new Thread()   {
			public void run()    {
				while(true)   {
					p.print1();
				}
			}
		}.start();

		new Thread()   {
			public void run()    {
				while(true)   {
					p.print1();
				}
			}
		}.start();

}
}

class Printer {  
Demo d = new Demo();
	public void print1()   {
		synchronized (d) {
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("Ա");
		System.out.print("\r\n");
		}
	}

   public void print2()  {
	   synchronized (d) {                                                 //ͬ�������,�������������
	   System.out.print("��");
	   System.out.print("־");
	   System.out.print("��");
	   System.out.print("��");
	   System.out.print("\r\n");
   }
}
}
   class  Demo{};
