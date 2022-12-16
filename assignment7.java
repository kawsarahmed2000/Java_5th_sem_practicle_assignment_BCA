import java.util.Scanner;

public class assignment7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		try {
			int n = Integer.parseInt(args[0]),s=0;
			for(int i = 0;i<n;i++) {
				s+=in.nextInt();
			}
			System.out.println("The result is "+s);
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
