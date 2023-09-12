package callingMethods;

public class ReverseNumber {
	int a1;
	int b1;
public static void main(String[] args) {
	Values v1= new Values();
	      v1.a=10;
	      v1.b=20;
	      v1.c=v1.a;
	      v1.a=v1.b;
	      v1.b=v1.c;
	      System.out.println(v1.a);
	      System.out.println(v1.b);
	      ReverseNumber v2= new ReverseNumber();
	      
	      v2.a1=v1.a;
	      v2.b1=v1.b;
	      v2.run();
}public int run() {
	System.out.println(a1);
	System.out.println(b1);
	return 20;
}
}
