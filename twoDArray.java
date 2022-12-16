import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[][],n,m;
		System.out.println("Enter array row :");
		n=sc.nextInt();
		System.out.println("Enter array coloumn :");
		m=sc.nextInt();
		
		a= new int[n][m];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("The row this array is : "+a.length);
		System.out.println("The coloumn this array is : "+a[0].length);

	}

}
