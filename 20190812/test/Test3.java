package com.heima.test;

public class Test3 {

	/*
	 *������ʾ
	 *����:ͳ��ABCDEabcde12345!@#$%^  ����ַ����Ĵ�д��ĸ,Сд��ĸ,���ּ��������ų��ֵĴ���.
	*/
	public static void main(String[] args) {
		String s = "ABCDEabcde123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		
		//1,��ȡÿһ���ַ�,ͨ��forѭ������
		for(int i = 0; i < s .length(); i++) {
			char c = s.charAt(i);
			//2,�ж��ַ��Ƿ��������Χ��
			if(c >= 'A' && c <= 'Z')  {
				big++;
			}else if (c >= 'a' && c <= 'z') {
				small++;
			}else if (c >= '0' && c <='9') {
				num++;
			}else {
				other++;
			}
		}
		System.out.println(s + "�д�д��ĸ��:" + big + "��, Сд��ĸ��:" + small + "��,�����ַ�: " + num + "��,�����ַ�:''" +
				 + other + "��");
}
}
