package package1;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int[ ] arr= {11,3,6,7,8};
		 int key;
		 
		 System.out.println("Enter search key: ");
		 key = scan.nextInt();
		 for(int i=0;i< arr.length;i++) {
			 
			 if(arr[i]==key) {
				
				 System.out.println("found the key");
				 break;
			 }}}
		
		 }
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
     public static void main(String[] args) {
	      // Scanner class object to read input
	      Scanner scan = new Scanner(System.in);
	      
	      // array
	      int arr[] = { 50, 90, 30, 70, 60 };

	      // read search key
	      int key = 0;
	      System.out.print("Enter search key: ");
	      key = scan.nextInt();

	      // linear search
	      int index = linearSearch(arr, key);

	      // display result
	      if (index == -1)
	         System.out.println(key + " not Found.");
	      else
	         System.out.println(key + " Found at Index = " + index);
	      
	      // close Scanner class object
	      scan.close();

	   }

	   public static int linearSearch(int[] arr, int key) {
	      // traverse through the array
	      for (int i = 0; i < arr.length; i++) {
	         if (key == arr[i])
	            return i;
	      }
	      return -1;
	   } */
	


