  class Demo1_Switch {	
	  public static void main(String[] args) {
    /*
	switch���ĸ�ʽ
* 
		switch(���ʽ) {
		      case ֵ1��
				�����1;
				break;
			    case ֵ2��
				�����2;
				break;
			    ��
			    default��	
				�����n+1;
				break;
	    }
	*/

	 String name = "rose";
	 String gender = "��ʿ";
	 switch (gender) {
	 case "��ʿ":
		 System.out.println(name + "��һλ"+ gender + "ϲ������Ϸ");
	 break;
	 case "Ůʿ":
           System.out.println(name + "��һλ"+ gender + "ϲ������");
     break;
	 default:
		 System.out.println(name + "��һλ" + gender + "����ά����ò");
     break;
	 }
	
	}
}
