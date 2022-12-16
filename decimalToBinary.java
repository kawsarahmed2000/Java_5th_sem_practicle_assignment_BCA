import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[];
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for convert : ");
		int n = sc.nextInt(),k=n;
		
		a = new int[10];
		int i =0;
		while(n>0) {
			r=n%2;
			a[i++]=r;
			n/=2;
		}
		System.out.println("The binary of "+k+" is:");
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]);
		}

	}

}
