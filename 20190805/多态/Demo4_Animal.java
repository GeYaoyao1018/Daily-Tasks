 class Demo4_Animal {	
	public static void main(String[] args) {
		//Cat c1 = new Cat();
		//c1.eat();
		method(new Cat());
		method(new Dog());
	}

/* public static void method(Cat c) {
	c.eat();
 }

 public static void method(Dog d) {
	d.eat();
	*/

 public static void method(Animal a) {
	 if (a instanceof Cat) {
		 Cat c = (Cat)a;
		 c.eat();
		 c.catchMouse();
	 }else if (a instanceof Dog) {
			 Dog d = (Dog)a;
			 d.eat();
			 d.lookHome();
	 }else {
		 a.eat();

		 }
	 }
 }
 





 class Animal {
	public void eat() {
		System.out.println("∂ØŒÔ≥‘∑π");
		}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("√®≥‘”„");

}
}

class Dog  extends Animal {
	public void eat() {
		System.out.println("π∑≥‘»‚");
}
	public void lookHome() {
		System.out.println("ø¥º“");
}
}