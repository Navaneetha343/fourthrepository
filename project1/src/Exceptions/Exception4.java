package Exceptions;

public class Exception4 {
	public static void main(String[] args) {

		System.out.println("1st line of excution");

		try {
			System.out.println("try block started");
			String s = null;
			String s2 = "hi";

			System.out.println(s.length());
		} catch (ArithmeticException s1) {
			s1.printStackTrace();
		} catch (NullPointerException n1) {
			n1.printStackTrace();

		}
}}
