  class Demo1_If {
   	  public static void main(String[] args) {
	     
		//int age = 19;
		
		/*if (age >=18) {
		   System.out.println("���������վ");
		   }

		   System.out.println("����");*/
		  /* ִ�����̣�
	* �ȼ���Ƚϱ��ʽ��ֵ�����䷵��ֵ��true����false��
	* �����true����ִ������壻
	* �����false���Ͳ�ִ������壻*/

	/*ע������
	  a:�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
	 b:if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ�
	   ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
	 c:һ����˵����������ž�û�зֺţ��зֺž�û���������*/

    /*if���ĸ�ʽ2
* 
		if(�Ƚϱ��ʽ) {
			�����1;
		}else {
			�����2; */

        /* int x = 0;
		 if (x ==1) {
			 System.out.println("�в�����ӭ��");
		 }else {System.out.println("Ů������ӭ��");
		 } */

		 //If ����Ƕ��

		 int a = 50;
		 int b = 20;
		 int c = 30;

		 if (a >b) {
			 if (a > c) {
				 System.out.println(a + "�����ֵ");
			 }else {
					 System.out.println(c + "�����ֵ");

			 }
		 }else { //b >= a
			 if (b > c) {
				 System.out.println(b + "�����ֵ");

			 }else {
				System.out.println(c + "�����ֵ");
			 }
			 }
	}
}
