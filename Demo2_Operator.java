  class Demo2_Operator {	
	  public static void main(String[] args) {
		  //&,|,^,!
		  //int x = 10
		  //5 < x < 15
		  //x > 5 & x < 15
		  //�߼��� & ����and ��false��false
		  //int a = 10;
		  //int b = 20;
		  //int c = 30;
		/*System.out.println(a < b & b < c);  //true & true  true
		System.out.println(a < b & b > c);  //true & false false
		System.out.println(a > b & b > c);  //false & true  false
		System.out.println(a > b & b > c);  //false & false  false*/

        /*//�߼� | ��or ��true��true
		System.out.println(a < b | b < c ); //true | true true
		System.out.println(a < b | b > c ); //true false
		System.out.println(a > b | b < c ); //false true
		System.out.println(a > b | b > c ); //false false

       //�߼����,//������ͬ��Ϊtrue ��ͨ��false
		System.out.println(a < b ^ b < c ); //true true true
		System.out.println(a < b ^ b > c ); //true false       
		System.out.println(a > b ^ b < c ); //false true
		System.out.println(a > b ^ b > c ); //false false
     
	   //�߼���!
	   System.out.println(!true);
	   System.out.println(!!true);*/

	   //&&��&������
	   /*a: ���ս����һ��.
	   b: &&���ж�·Ч��.�����false,�ұ߲�ִ��.*/
	   /*||��|������
		   a:���ս����һ��
		   b:˫|| ͬ�����ж�·Ч��,���Ϊtrue �ұ߲�ִ��.*/
	   /*int a = 10;
       int b = 20;
	   int c = 30;
     System.out.println(a < b && b < c);
	 System.out.println(a < b && b > c);
	 System.out.println(a > b && b < c);
	 System.out.println(a > b && b > c);*/
   
	
	/*
	 A:������ʾ >>,>>>,<<���÷�:
	*  <<:����	������λ�������ұ߲���0
	*  >>:����	���λ��0����߲���0;���Ϊ��1����߲���1
	*  >>>:�޷������� �������λ��0����1����߲���0
	*  ����Ч�ʵ����2 * 8�Ľ��*/

	//����,�����ƶ���λ���ǳ���2�ļ�����
   //System.out.println(12 << 1);      //24
   //System.out.println(12 << 2);      //48

   /*
       00000000 00000000 00001100   12�Ĳ���
    (0)0000000 00000000 000011000   24�Ĳ���
 (0)(0)00000000 00000000 000011000   48�Ĳ���*/

  //���� �����ƶ���λ���ǳ���2�ļ�����
  /*System.out.println(12 >> 1);    
  System.out.println(12 >> 2); */

  //��Ԫ�����  (��ϵ���ʽ) ? ���ʽ1 : ���ʽ2;
       int x = 10;
	   int y = 5;
       int z;
	   z = (x > y) ? x : y;
	   System.out println("z = " + z);








	}

}
