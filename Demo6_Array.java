 class Demo6_Array {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55};
		reverseArray(arr);
		print (arr);

		/*
		* �������������������������е�ÿһ��Ԫ�ء�
	* ���������:arr.length����ĳ���
	* ������������:arr.length - 1;
	 */
     

	 /*
	 ����Ԫ�ط�ת
	 1,��ȷ����ֵ����void
	 2,��ȷ�����б�int [] arr
	 */

	 public static void reverseArray(int [] arr) {
		 for (int i = 0;i < arr.length / 2 ;i++ ) {

			 //arr[0]��[arr.length-1-0]����
			 //arr[1]��[arr.length-1-1]����
			 //arr[2]��[arr.length-1-2]����
			 //...


			 int temp = arrr [i];
			 arr[i] = arr[arr.length-1-i];
			 arr[arr.length-1-i] = temp;

		 }

	}

	/*
	�������
	,��ȷ����ֵ����void
	2,��ȷ�����б�int[] arr
	*/
   public static void print(int [] arr) {
	   for (int i = 0;i < arr.length ;i++ ) {
		   System.out.print(arr[i] + "");
	   }


   }
	}
 }