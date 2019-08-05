 class Demo3_Interface  {
 	public static void main(String[] args) {
	}
}








interface InterA {
	public abstract void printA();
}

interface InterB {
	public abstract void printB();
}

class Demo implements InterA,InterB {
	public void printA()  {
		System.out.println("printA");
	}

	public void printB() {
		System.out.println("printB");

}
}