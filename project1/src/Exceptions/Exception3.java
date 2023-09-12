package Exceptions;

public class Exception3 {

	public static void main(String[] args) {
		System.out.println("1st line of excution");

		try {
			System.out.println("try block started");
			String s = "Hi";

			System.out.println(s.length());
		} catch (Exception s1) {
			s1.printStackTrace();
		}

	}

}
