import java.util.Scanner;

public class arrayOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a[],n;
		System.out.println("Enter how many number");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements: ");
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements are: ");
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	static void getArr() {
		System.out.println("Enter array elements: ");
		
	}

}
