//java program to implement interface i.e multiple inheritance
interface I {
	static int x=13;
	public void disp_x();
}

class I_class{
	int x1;
	
	void set_x1(int x) {
		x1=x;
	}
	void disp_x1() {
		System.out.println("The value of x1 is "+x1);
	}
}

class inter extends I_class implements I {
	
	public void disp_x() //method defination
	{
		System.out.println("The value of x from  interface is "+ x);
	}
}

public class InterfaceUsages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter i = new inter();
		i.disp_x();
		i.set_x1(15);
		i.disp_x1();
		

	}

}
