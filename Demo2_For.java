 class Demo2_For {	
	public static void main(String[] args) {

	/*:������ʾ
	* �������1-10֮������֮��
* B:ѧ����ϰ
	* �������1-100֮��ż����
	* �������1-100֮��������
    */
    
	 
	 /*int sum = 0;   
	 for (int i =1;i <= 10 ;i++ ) {
		 sum = sum = i;                  //1-10�ĺ�
	 }
	 */
	
		
	//1-100��ż����
    int sum = 0;
		for (int i= 1;i <= 100 ;i++ ) {
		if (i % 2 == 0) {
			sum= sum + i;
		}
		
		}

     System.out.println("sum = " + sum);

     //1-100������ͬ��
	}
}
