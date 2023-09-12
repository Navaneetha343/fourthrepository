package Exceptions;

public class Demo {
	public static void main(String... args) {
		Demo d = new Demo();

		Thread t1 = new Thread("main thread");

		t1.start();
		
		t1.start(); // java.lang.IllegalThreadStateException
		System.out.println(t1.getName());
	}

}
