
class Animal {
	void eat() {
		System.out.println("Animal...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("BabyDog...");
	}
}

public class MultilevelInheritance {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}
