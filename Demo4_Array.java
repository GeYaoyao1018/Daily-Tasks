class Demo4_Array {	
	public static void main(String[] args) {
        int [] arr = {33,55,77,44,66};
		int max = getMax(arr);
		System.out.println(max);
	}

	/*
	获取数组中最大值
	1,返回值类型int
	2,参数列表int [] arr
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

