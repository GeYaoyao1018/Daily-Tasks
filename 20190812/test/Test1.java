package com.heima.test;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++){
			System.out.println("请输入用户名:");
			String userName = sc.nextLine();
			System.out.println("请输入密码:");
			String password = sc.nextLine();
			
			if ("admin".equals(userName) && "admin".equals(password))   {
				System.out.println("欢迎" + userName + "登录");
				break;
			}else  {
			     	if(i == 2)
					System.out.println("录入错误,你还有" + (2-i) + "次机会");
			}
		}
	}
}

