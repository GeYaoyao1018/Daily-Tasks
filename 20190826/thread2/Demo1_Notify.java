package com.heima.thread2;



public class Demo1_Notify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		 new Thread()   {
			 public void run()   {
				 while(true)  {
					 try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				 }
			 }
		 }.start();
			 new Thread()   {
				 public void run()   {
					 while(true)  {
						 try {
							p.print1();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					 }
				 }
			 }.start();
	}

}
class Printer {  
	private int flag = 1;
	public void print1() throws InterruptedException   {
		synchronized (this) {
			if (flag != 1)  {
				this.wait();
			}
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.print("员");
		System.out.print("\r\n");
		flag = 2;
		this.notify();
		}
	}

   public void print2() throws InterruptedException  {
	   synchronized (this) {                                                 //同步代码块,锁对象是任意的
	  if(flag !=2)   {
		  this.wait();
	  }
	System.out.print("传");
	   System.out.print("志");
	   System.out.print("播");
	   System.out.print("客");
	   System.out.print("\r\n");
	   flag = 1;
	   this.notify();
   }
}
}

