package com.heima.threadmethod;

public class Demo1_Name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          //demo1();
          new Thread()   {
        	  public void run()   {
        		  this.setName("’≈»˝");
        		  System.out.println(this.getName() + "....aaaaaa");
        	  }
          }.start();
          new Thread()    {
        	  public void run()    {
        		  this.setName("∑ÔΩ„");
        		  System.out.println(this.getName() + "...bb");	  
        	  }
          }.start();
	}

	private static void demo1() {
		new Thread("‹Ω»ÿΩ„Ω„")   {
        	  public void run()   {
        		  System.out.println(this.getName() + "....aaaaaa");
        	  }
          }.start();
          new Thread("∑ÔΩ„")    {
        	  public void run()    {
        		  System.out.println(this.getName() + "...bb");	  
        	  }
          }.start();
	}

}
