  class Demo1_Switch {	
	  public static void main(String[] args) {
    /*
	switch语句的格式
* 
		switch(表达式) {
		      case 值1：
				语句体1;
				break;
			    case 值2：
				语句体2;
				break;
			    …
			    default：	
				语句体n+1;
				break;
	    }
	*/

	 String name = "rose";
	 String gender = "男士";
	 switch (gender) {
	 case "男士":
		 System.out.println(name + "是一位"+ gender + "喜欢玩游戏");
	 break;
	 case "女士":
           System.out.println(name + "是一位"+ gender + "喜欢购物");
     break;
	 default:
		 System.out.println(name + "是一位" + gender + "打激素维持容貌");
     break;
	 }
	
	}
}
