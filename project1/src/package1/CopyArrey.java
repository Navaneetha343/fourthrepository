package package1;

import java.util.Arrays;

public class CopyArrey {

	   public static void main(String[] args) {
	      // original array
	      int arr[] = {10, 20, 30, 40, 50};
	      
	      // copy array using assignment operator
	      int newArr[] = arr;
	      
	      // display array
	      System.out.println("Original Array = " 
	                        + Arrays.toString(arr));
	      System.out.println("Copied Array = " 
	                        + Arrays.toString(newArr));
	   }
	}

