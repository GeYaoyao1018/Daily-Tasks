package com.heima.syn;

public class Demo4_DiedLock {

	/**
	 * @param args
	 */
	
	private static String s1 = "������";
	private static String s2 = "������";
	
	public static void main(String[] args) {
		new Thread()   {
			public void run()    {
				
					while (true)  {
						synchronized (s1) {
										System.out.println("��ȡ" +s1 + "�ȴ�" + s2);
										synchronized (s2) {
											System.out.println("ǩ��" + s2 + "����");
											
										}
					}
					
				}
			}
		}.start();
		new Thread()   {
			public void run()    {
				
					while (true)  {
						synchronized (s1) {
										System.out.println("��ȡ" +s1 + "�ȴ�" + s2);
										synchronized (s2) {
											System.out.println("ǩ��" + s2 + "����");
											
										}
					}
					
				}
			}
		}.start();

	}

}
