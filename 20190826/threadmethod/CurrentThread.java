package com.heima.threadmethod;

public class CurrentThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread("С��") {
			public void run()  {
				System.out.println(getName() + "......aaaaa");
			}
		}.start();
		
		new Thread (new Runnable() {
			public void run()   {
				System.out.println(Thread.currentThread().getName() + "....b");
			}
		}).start();
		Thread.currentThread().setName("�������߳�");
		System.out.println(Thread.currentThread().getName());
	}

}
