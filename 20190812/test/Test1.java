package com.heima.test;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++){
			System.out.println("�������û���:");
			String userName = sc.nextLine();
			System.out.println("����������:");
			String password = sc.nextLine();
			
			if ("admin".equals(userName) && "admin".equals(password))   {
				System.out.println("��ӭ" + userName + "��¼");
				break;
			}else  {
			     	if(i == 2)
					System.out.println("¼�����,�㻹��" + (2-i) + "�λ���");
			}
		}
	}
}

