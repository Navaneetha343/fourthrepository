package Exceptions;
import java.util.Scanner;
public class ExceptionHandling  {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Enter the email");
	String email= sc.nextLine();
	
	
	
	try {if(email== "ellitamnavaneetha@gmail.com" ) 
	
	System.out.println("Enter the passward");
	//String password =sc.nextLine();
	//if(password== "nava34") {
	//System.out.println("Successfully logged in");}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
}
}
