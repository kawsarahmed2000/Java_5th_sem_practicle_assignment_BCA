
class multiT1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("multiT1 " + i);
		}
	}
}

class multiT2 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("multiT2 " + i);
		}
	}
}

class multiT3 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("multiT3 " + i);
		}
	}
}

public class threadExapm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiT1 a = new multiT1();
		multiT2 b = new multiT2();
		multiT3 c = new multiT3();

		a.start();
		b.start();
		c.start();

	}

}
