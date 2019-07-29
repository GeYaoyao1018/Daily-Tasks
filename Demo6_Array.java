 class Demo6_Array {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55};
		reverseArray(arr);
		print (arr);

		/*
		* 数组遍历：就是依次输出数组中的每一个元素。
	* 数组的属性:arr.length数组的长度
	* 数组的最大索引:arr.length - 1;
	 */
     

	 /*
	 数组元素反转
	 1,明确返回值类型void
	 2,明确参数列表int [] arr
	 */

	 public static void reverseArray(int [] arr) {
		 for (int i = 0;i < arr.length / 2 ;i++ ) {

			 //arr[0]和[arr.length-1-0]交换
			 //arr[1]和[arr.length-1-1]交换
			 //arr[2]和[arr.length-1-2]交换
			 //...


			 int temp = arrr [i];
			 arr[i] = arr[arr.length-1-i];
			 arr[arr.length-1-i] = temp;

		 }

	}

	/*
	数组遍历
	,明确返回值类型void
	2,明确参数列表int[] arr
	*/
   public static void print(int [] arr) {
	   for (int i = 0;i < arr.length ;i++ ) {
		   System.out.print(arr[i] + "");
	   }


   }
	}
 }