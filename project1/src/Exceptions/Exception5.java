package Exceptions;

public class Exception5 {
	public static void main(String[] args) {

		System.out.println("1st line of excution");

		try {
			System.out.println("try block started");
			String s = null;
			String s2 = "hi";

			System.out.println(s.length());
		} catch (ArithmeticException s1) {
			s1.printStackTrace();
		} finally {
			System.out.println("finally block completed");
		}
	}
}
