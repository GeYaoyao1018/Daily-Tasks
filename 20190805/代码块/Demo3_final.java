  class Demo3_final {	
	 public static void main(String[] args) {
	   Demo d = new Demo();
	   d.print();
	}
}






class Demo {

	//final int num = 10;                 ��Ա������Ĭ�ϳ�ʼ��ֵ����Ч��
    final int num;
	public Demo() {
		num = 10;
	}
	public void print() {
		System.out.println(num);
	}
}