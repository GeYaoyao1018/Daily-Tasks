package com.heima.test;

public class Test7 {

	/**
	 * ͳ��С���ڴ��г��ֵĴ���
	 */
	public static void main(String[] args) {
      String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
	  String min = "heima";
	  int count = 0;
	  int index = 0;
	  while ((index = max.indexOf(min)) != -1)  {
		  count++;
		  max = max.substring(index + min.length());
	  }
	  System.out.println(count);
		  
	}
}
