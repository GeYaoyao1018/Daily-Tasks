 import java.util.Scanner;
 class Demo_Method2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("�������һ������");
		int y = sc.nextInt();
	  
	  int max = getMax(x,y);
	  System.out.println(max);

	}

	/*
	�����������������ֵ
	1,��ȷ����ֵ����
	2,��ȷ�����б� inta,intb
	*/

	public static int getMax(int a,int b) {
    return a > b ? a : b;

	
}
 }
