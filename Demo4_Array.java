class Demo4_Array {	
	public static void main(String[] args) {
        int [] arr = {33,55,77,44,66};
		int max = getMax(arr);
		System.out.println(max);
	}

	/*
	��ȡ���������ֵ
	1,����ֵ����int
	2,�����б�int [] arr
	*/

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length ; i++ ) {
			if (max < arr[i]) {
				 max = arr[i];
			}
		}
		return max;
	}
}

