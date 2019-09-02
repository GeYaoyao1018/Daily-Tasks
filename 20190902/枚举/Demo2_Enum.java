package com.heima.Ã¶¾Ù;

public class Demo2_Enum {

	public static void main(String[] args) {
		Week2 mon = Week2.MON;
		Week2 tue = Week2.TUE;
		Week2 wed = Week2.WED;
		
		System.out.println(mon.ordinal());
		System.out.println(tue.ordinal());
		System.out.println(tue.ordinal());	
		
		
		System.out.println(mon.compareTO(tue));
		System.out.println(mon.compareTO(wed));

	}

}
