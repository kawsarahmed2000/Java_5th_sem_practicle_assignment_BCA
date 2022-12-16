
class runExmp1 implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("runExmp1 " + i);
		}
	}
}

class runExmp2 implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("runExmp2 " + i);
		}
	}
}

class runExmp3 implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("runExmp3 " + i);
		}
	}
}

public class RunnableImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runExmp1 a = new runExmp1();
		runExmp2 b = new runExmp2();
		runExmp3 c = new runExmp3();

		Thread ta = new Thread(a);
		Thread tb = new Thread(b);
		Thread tc = new Thread(c);

		ta.start();
		tb.start();
		tc.start();
	}
}
