 class Demo7_Array {	
	public static void main(String[] args) {
		/** ����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)*/

		int [] arr = {11,22,33,44,55,66,77};
		int index = getIndex (arr,11);

		System.out.println(index);;
	}


    /*
	����Ԫ������
	1,����ֵ����int
	2,m��ȷ�����б�,int[] arr,int value
	*/

	public static int getIndex(int[] arr,int value) {
		for (int i  =0;i < arr.length ; i++) {      //����ı���
			if (arr[i] == value) {           //��������е�Ԫ������ҵ�Ԫ��ƥ��
				return i;
			}
		}
           return -1;
 }
 }
              
