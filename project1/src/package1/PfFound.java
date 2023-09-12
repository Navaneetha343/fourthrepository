package package1;

public class PfFound {
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
				System.out.println("Enter basic salary :");
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br= new BufferedReader(isr);
				String result = br.readLine();
				int salary=Integer.parseInt(result);
				{ System.out.println((12/100)*salary);
				
				}
	}
	}

}
