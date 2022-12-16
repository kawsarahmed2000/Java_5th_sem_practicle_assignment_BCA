
public class cmdARG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt, i=0,n,s=0;
		cnt = args.length;
		while(i<cnt) {
			n= Integer.parseInt(args[i]);
			s=s+n;
			i++;
		}
		System.out.println("The sum of integer is "+s);

	}

}
