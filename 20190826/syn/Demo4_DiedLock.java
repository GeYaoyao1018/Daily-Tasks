package com.heima.syn;

public class Demo4_DiedLock {

	/**
	 * @param args
	 */
	
	private static String s1 = "筷子左";
	private static String s2 = "筷子右";
	
	public static void main(String[] args) {
		new Thread()   {
			public void run()    {
				
					while (true)  {
						synchronized (s1) {
										System.out.println("获取" +s1 + "等待" + s2);
										synchronized (s2) {
											System.out.println("签到" + s2 + "开吃");
											
										}
					}
					
				}
			}
		}.start();
		new Thread()   {
			public void run()    {
				
					while (true)  {
						synchronized (s1) {
										System.out.println("获取" +s1 + "等待" + s2);
										synchronized (s2) {
											System.out.println("签到" + s2 + "开吃");
											
										}
					}
					
				}
			}
		}.start();

	}

}
