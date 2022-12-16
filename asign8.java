
public class asign8 {

	public static void main(String[] args) {

		char[] ch = {'j','a','v','a','t','p','o','i','n','t'};
		String s = new String(ch);
		
		System.out.println("The string is "+s);
		System.out.println("The indidividual first character is "+ch[0]);
		String s1 = new String("Kawsar ");
		String s2 = new String("Ahmed");
		System.out.println("The string is "+s1.concat(s2));
		

		StringBuffer s3 = new StringBuffer("John ");
		StringBuffer s4 = new StringBuffer("Ronglang");
		s3.append(s4);
		System.out.println("The string is "+s3);
		s3.insert(5,"Boos ");
		System.out.println(s3);
		s3.setLength(9);
		System.out.println("The string is "+s3);
		if(s1.equals(s2)) {
			System.out.println("The string is equal ");
		}else {
			System.out.println("The string is not equal");
		}
		s3.setCharAt(3, 'x');
		System.out.println("The updated string is "+s3);
	}

}
