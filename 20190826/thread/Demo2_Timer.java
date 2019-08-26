package com.heima.thread;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo2_Timer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		Timer t = new Timer();
		t.schedule(new MyTimerTask(), new Date(188, 8, 23, 15, 37));
		while(true)   {
			Thread.sleep(1000);
				System.out.println(new Date());
		}

	}

}
class MyTimerTask extends TimerTask  {

	@Override
	public void run() {
		System.out.println("Æð´²±³Ó¢Óïµ¥´Ê");
	}
	
}