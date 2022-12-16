
class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		// calling the construct of parent Exception
		super(str);
	}
}

public class userDefinedException {

	static void validate(int age) throws InvalidAgeException {
		if (age > 18) {
			System.out.println("Welcome to vote");
		} else {
			throw new InvalidAgeException("Age is not valid to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(16);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
