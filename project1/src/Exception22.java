import java.util.Scanner;
public class Exception22 { 

	String emailid;
		void m2(int a, int b) throws Exception {
			//System.out.println("Enter the password");
			try {if(emailid=="elli");
				//int c = a / b;
				//System.out.println(c);
			} catch (Exception e) {
				throw new InvalidNumberException("in valid id or passward");
			}
			System.out.println("m2() - ended");
		}

		void m1(int a, int b) throws Exception {
			System.out.println("m1() - started");
			m2(a, b);
			System.out.println("m1() - ended");
		}

		public static void main(String[] args) {
			
			
			
			
			
			try {Scanner sc= new Scanner(System.in);
			System.out.println("Enter emailid");
			      String emailid= sc.nextLine();
			      
				Exception22 d = new Exception22();
				d.m1(10, 0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("main() - method ended");
		}
	

	}


