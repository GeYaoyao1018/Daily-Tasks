 import java.util.Scanner;
 class Demo_Method2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int x = sc.nextInt();
		System.out.println("请输入第一个整数");
		int y = sc.nextInt();
	  
	  int max = getMax(x,y);
	  System.out.println(max);

	}

	/*
	返回整个整数的最大值
	1,明确返回值类型
	2,明确参数列表 inta,intb
	*/

	public static int getMax(int a,int b) {
    return a > b ? a : b;

	
}
 }
