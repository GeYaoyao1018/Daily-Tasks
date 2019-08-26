package com.heima.threadmethod;

public class CurrentThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread("小二") {
			public void run()  {
				System.out.println(getName() + "......aaaaa");
			}
		}.start();
		
		new Thread (new Runnable() {
			public void run()   {
				System.out.println(Thread.currentThread().getName() + "....b");
			}
		}).start();
		Thread.currentThread().setName("我是主线程");
		System.out.println(Thread.currentThread().getName());
	}

}
