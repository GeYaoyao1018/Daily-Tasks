 class Demo8_Array {	
	 public static void main(String[] args) {
		 /*
		 :������ʾ
* 
		���󣺹�˾�����۶����
		ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
		��һ���ȣ�22,66,44
		�ڶ����ȣ�77,33,88
		�������ȣ�25,45,65
		���ļ��ȣ�11,66,99
	     */
       int [] [] arr = {{22,64,44},{77,33,88},{25,45,65},{11,66,99}};

	   int sum = 0;     //�������
       for (int i = 0;i < arr.length ;i++ ) {   //��ȡÿһ��һά����
		   for (int j=0;j < arr[i].length ;j++ ) { //��ȡÿһ��һά���������Ԫ��
			   sum = sum + arr[i][j];               //�ۼ�
		   }
       }


		System.out.println(sum);
	}
}
