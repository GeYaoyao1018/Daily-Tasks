package com.heima.StringBuffer;

public class Demo2_StringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		 
		System.out.println(sb.toString());      //StringBuffer ������д��tostring����,��ʾ���Ƕ����е�����
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
}
}
