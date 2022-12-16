import java.util.Scanner;

public class FactorialOfAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,fact=1;
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		
		System.out.println("Factorial is : "+ facto(a));

	}
	public static int facto(int n) {
		if(n==0) return 1;
		return n*facto(n-1);
	}

}
