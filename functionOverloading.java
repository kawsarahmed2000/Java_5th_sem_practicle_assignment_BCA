
class FunOverloading{
//	void put(int a) {
//		System.out.println("Integer function "+a);
//	}
	void put(float a) {
		System.out.println("Float function "+a);
	}
	void put(double a) {
		System.out.println("Double function "+a);
	}
}
public class functionOverloading {

	public static void main(String[] args) {
		
		FunOverloading ob = new FunOverloading();
		ob.put(20);
		ob.put(23.2F);
		ob.put(34.55);

	}

}
