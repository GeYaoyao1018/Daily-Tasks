  class Demo1_If {
   	  public static void main(String[] args) {
	     
		//int age = 19;
		
		/*if (age >=18) {
		   System.out.println("可以浏览网站");
		   }

		   System.out.println("完了");*/
		  /* 执行流程：
	* 先计算比较表达式的值，看其返回值是true还是false。
	* 如果是true，就执行语句体；
	* 如果是false，就不执行语句体；*/

	/*注意事项
	  a:比较表达式无论简单还是复杂，结果必须是boolean类型
	 b:if语句控制的语句体如果是一条语句，大括号可以省略；
	   如果是多条语句，就不能省略。建议永远不要省略。
	 c:一般来说：有左大括号就没有分号，有分号就没有左大括号*/

    /*if语句的格式2
* 
		if(比较表达式) {
			语句体1;
		}else {
			语句体2; */

        /* int x = 0;
		 if (x ==1) {
			 System.out.println("男厕所欢迎您");
		 }else {System.out.println("女厕所欢迎您");
		 } */

		 //If 语句的嵌套

		 int a = 50;
		 int b = 20;
		 int c = 30;

		 if (a >b) {
			 if (a > c) {
				 System.out.println(a + "是最大值");
			 }else {
					 System.out.println(c + "是最大值");

			 }
		 }else { //b >= a
			 if (b > c) {
				 System.out.println(b + "是最大值");

			 }else {
				System.out.println(c + "是最大值");
			 }
			 }
	}
}
