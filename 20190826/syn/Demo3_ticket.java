package com.heima.syn;

public class Demo3_ticket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         MyTicket mt = new MyTicket();
         new Thread(mt).start();
         new Thread(mt).start();
         new Thread(mt).start();
         new Thread(mt).start();
	}

}

class MyTicket implements Runnable   {
   private int tickets = 100;
	@Override
	public void run() {
		while (true)  {
			synchronized (this) {
				if (tickets <= 0)  {
					break;
				}
				
			}
			System.out.println(Thread.currentThread().getName() + "....ÕâÊÇµÚ" + tickets-- + "ºÅÆ±");
		}
	}
	
}