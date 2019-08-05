 class Demo1_InnerClass {	
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();

		oi.method();
	}
}




class Outer {
	class Inner  {
		public void method(){
			System.out.println("Hello,World");
	}
}
}

