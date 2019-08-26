package com.heima.thread2;

public class Demo2_NotifyAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            final Printer2 p = new Printer2();
            new Thread()  {
            	public void run ()   {
            		while(true)  {
            			try {
							p.print1();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
            		}
            	}
            }.start();
            new Thread()  {
            	public void run ()   {
            		while(true)  {
            			try {
							p.print2();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
            		}
            	}
            }.start();
            new Thread()  {
            	public void run ()   {
            		while(true)  {
            			try {
							p.print3();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
            		}
            	}
            }.start();
	}

}
class Printer2 {  
	private int flag = 1;
	public void print1() throws InterruptedException   {
		synchronized (this) {
			while (flag != 1)  {
				this.wait();
			}
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("Ա");
		System.out.print("\r\n");
		flag = 2;
		//this.notify();
		 this.notifyAll();
		}
	}

   public void print2 () throws InterruptedException  {
	   synchronized (this) {                                                 //ͬ�������,�������������
	  while(flag !=2)   {
		  this.wait();
	  }
	System.out.print("��");
	   System.out.print("־");
	   System.out.print("��");
	   System.out.print("��");
	   System.out.print("\r\n");
	   flag = 3;
	   //this.notify();
	   this.notifyAll();
   }
}

public void print3() throws InterruptedException  {
	   synchronized (this) {                                                 //ͬ�������,�������������
	  while(flag !=3)   {
		  this.wait();
	  }
	System.out.print("I");
	   System.out.print("T");
	   System.out.print("H");
	   System.out.print("M");
	   System.out.print("A");
	   System.out.print("\r\n");
	   flag = 1;
	  // this.notify();
	  this.notifyAll();
}
}
}


