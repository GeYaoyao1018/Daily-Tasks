package com.heima.threadmethod;

public class Demo4_join {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Thread t1 = new Thread()  {
			public void run()   {
				for(int i = 0; i < 10; i++)   {
					System.out.println(getName()  + "aaaaaaaaa");
					
				}
			}
		};
		final Thread t2 = new Thread()  {
			public void run()   {
				for(int i = 0; i < 10; i++)   {
					if(i == 2){
						try {
							//t1.join();
							t1.join(1);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(getName()  + "bbbbbb");
        				
        		}
        		}
        };
        t1.start();
        t2.start();
	}
}
	
