package com.heima.StringBuffer;

public class Demo3_StringBuffer {

	/**
	 * ɾ��
	 */
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer();
		sb.append("heima");
		//sb.deleteCharAt(4);
		//sb.delete(0, 2);
	  //	System.out.println(sb);
		sb.delete(0, sb.length());
		System.out.println(sb);
	}

}
