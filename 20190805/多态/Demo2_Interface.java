 class Demo2_Interface {	
	 public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		System.out.println(Inter.num);
	}
}




interface Inter {
	final int num = 10;

	//public Inter() {}             �ӿ���û�й��췽��

	//public void print()  {         �ӿ��в��ܶ���ǳ��󷽷�
 
  abstract void print();

}

class Demo implements Inter {
	public void print() {
		//num = 20
		System.out.println(num);
	}

	public Demo () {
		super();

	}
}