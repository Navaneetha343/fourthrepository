package Exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// int a=30;
		// int b=0;
		/// System.out.println(a/b);

		try {
			int a = 30;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("run");
	}
}