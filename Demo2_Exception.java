  class Demo2_Exception {
	public static void main(String[] args) {
		int [] arr = new int [5];          //0x0011
		//System.out.println(arr[-1]);        //�����������в����ڵ�����,���������Խ���쳣.

		arr = null;                         //���������ø�ֵΪnull,��ȥ���������е�Ԫ��ʱ����ֿ�ָ��.
		System.out.println(arr[0]);
		
		/*
		 a:ArrayIndexOutOfBoundsException:��������Խ���쳣
		* ԭ��������˲����ڵ�������
	* b:NullPointerException:��ָ���쳣
		* ԭ�������Ѿ�����ָ����ڴ��ˡ����㻹��������ȥ����Ԫ�ء�
		*/
	}
}
