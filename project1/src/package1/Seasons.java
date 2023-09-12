package package1;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
public class Seasons {
public static void main(String[] args)throws IOException {
	System.out.println("Enter Day Number :");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	String result = br.readLine();
	int number=Integer.parseInt(result);
	switch(number) {
	case 1 : System.out.println("winter season");
	break;
	case 2 : System.out.println("summer");
	break;
	case 3 : System.out.println("summer");
	break;
	case 4 : System.out.println("summer");
	break;
	case 5 : System.out.println("summer");
	break;
	case 6 : System.out.println("rainy season");
	break;
	case 7 : System.out.println("rainy season");
	break;
	case 8 : System.out.println("rainy season");
	break;
	case 9 : System.out.println("rainy season");
	break;
	case 10 : System.out.println("winter season");
	break;
	case 11: System.out.println("winter season");
	break;
	case 12: System.out.println("winter season");
	break;
	
	}
	
}
}
