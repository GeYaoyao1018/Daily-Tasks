 class  Demo1_Interface {
	public static void main(String[] args) {
	//Inter i = new Inter();	//�ӿڲ��ܱ�ʵ����,��Ϊ���ó��󷽷�û������
	 Inter i = new Demo();
	 i.print();

  
	}
}








interface Inter {
	public abstract void print();    //�ӿ��еķ������ǳ����
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}

