  class Demo2_Operator {	
	  public static void main(String[] args) {
		  //&,|,^,!
		  //int x = 10
		  //5 < x < 15
		  //x > 5 & x < 15
		  //逻辑与 & 并且and 遇false则false
		  //int a = 10;
		  //int b = 20;
		  //int c = 30;
		/*System.out.println(a < b & b < c);  //true & true  true
		System.out.println(a < b & b > c);  //true & false false
		System.out.println(a > b & b > c);  //false & true  false
		System.out.println(a > b & b > c);  //false & false  false*/

        /*//逻辑 | 或or 遇true则true
		System.out.println(a < b | b < c ); //true | true true
		System.out.println(a < b | b > c ); //true false
		System.out.println(a > b | b < c ); //false true
		System.out.println(a > b | b > c ); //false false

       //逻辑异或,//两边相同则为true 不通则false
		System.out.println(a < b ^ b < c ); //true true true
		System.out.println(a < b ^ b > c ); //true false       
		System.out.println(a > b ^ b < c ); //false true
		System.out.println(a > b ^ b > c ); //false false
     
	   //逻辑非!
	   System.out.println(!true);
	   System.out.println(!!true);*/

	   //&&与&的区别
	   /*a: 最终结果都一样.
	   b: &&具有短路效果.左边是false,右边不执行.*/
	   /*||与|的区别
		   a:最终结果都一样
		   b:双|| 同样具有短路效果,左边为true 右边不执行.*/
	   /*int a = 10;
       int b = 20;
	   int c = 30;
     System.out.println(a < b && b < c);
	 System.out.println(a < b && b > c);
	 System.out.println(a > b && b < c);
	 System.out.println(a > b && b > c);*/
   
	
	/*
	 A:案例演示 >>,>>>,<<的用法:
	*  <<:左移	左边最高位丢弃，右边补齐0
	*  >>:右移	最高位是0，左边补齐0;最高为是1，左边补齐1
	*  >>>:无符号右移 无论最高位是0还是1，左边补齐0
	*  最有效率的算出2 * 8的结果*/

	//左移,向左移动几位就是乘以2的几次幂
   //System.out.println(12 << 1);      //24
   //System.out.println(12 << 2);      //48

   /*
       00000000 00000000 00001100   12的补码
    (0)0000000 00000000 000011000   24的补码
 (0)(0)00000000 00000000 000011000   48的补码*/

  //右移 向右移动几位就是除以2的几次幂
  /*System.out.println(12 >> 1);    
  System.out.println(12 >> 2); */

  //三元运算符  (关系表达式) ? 表达式1 : 表达式2;
       int x = 10;
	   int y = 5;
       int z;
	   z = (x > y) ? x : y;
	   System.out println("z = " + z);








	}

}
