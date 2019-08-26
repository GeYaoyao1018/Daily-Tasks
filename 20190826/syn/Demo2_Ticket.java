package com.heima.syn;

public class Demo2_Ticket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      new Ticket().start();
      new Ticket().start();
      new Ticket().start();
      new Ticket().start();
	}

}

class Ticket extends Thread  {
	private static int ticket = 100;
	public void run()   {
		while(true)   {
			synchronized (Ticket.class) {
				if(ticket <=0)   {
					break;
				}
				
			}
			System.out.println(getName() + "....ÕâÊÇµÚ"  + ticket--  + "ºÅÆ±");
		}
	}
}
