class Demo3_Mark {	                            
	public static void main(String[] args) {
	 a: for (int i = 1;i <= 10 ;i++) {         //a���Ǳ��,ֻҪ�ǺϷ��ı�ʶ������
           System.out.println("i = " + i);
		   b: for (int j = 1;j <= 10 ;j++ ) {
			   System.out.println("j = " + j);
			    break a;  
		   }
		                           
		}
		
	}
}
