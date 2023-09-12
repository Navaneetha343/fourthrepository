package package1;

public class GreatestCmmonFactor {
public static void  main(String[] args) {
//int[] arr= {18,32};
int num1=18;
int num2=32;

	  while(num1 != num2) {
		    if(num1 > num2) 
		       num1 = num1 - num2;
		    else
		       num2 = num2 - num1;
		  }
}
