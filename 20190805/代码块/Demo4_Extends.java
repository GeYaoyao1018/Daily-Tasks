 class Demo4_Extends {
 	
	 public static void main(String[] args) {
		Son s = new Son();
		s.print();
		s.method();
	}
}









 class Father {
	public void print() {
		System.out.println("Fu print");
	}
}

class Son extends Father {
	public void method() {
		System.out.println("zi Method");
	}

	public void print()   {
		super.print();              //super���Ե��ø���ĳ�Ա����
		System.out.println("z1 print");
}
}