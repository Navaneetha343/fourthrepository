package callingMethods;


public class SwitchCase {
static	int marks=890;
	
	public static void main(String[] args) {
		run();
		System.out.println(marks);
	}
	
	
	
	public static int  run() {

		
		switch (marks) {
		case 950:
			System.out.println("1st rank");
			break;
		case 890:
			System.out.println("2st rank");
			break;
		case 850:
			System.out.println("3rd rank");
			break;
		case 820:
			System.out.println("4th rank");
			break;
			
		}
		return marks;

	}
}
