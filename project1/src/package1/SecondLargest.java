package package1;

public class SecondLargest {
	 public static void main(String[] args) {
		    
		  
		    int fmax = 0; 
		    int smax = 0; 
		    int[] arr1= {10,20,30,40,50};

		    
		    fmax = arr1[0];
		    smax = arr1[0];

		    for (int i = 1; i < arr1.length; i++) {
		      if (fmax < arr1[i]) {
		        smax = fmax;
		        fmax = arr1[i];
		      } else if(smax < arr1[i]) {
		        smax = arr1[i];
		      }
		    }

		   System.out.println(smax);
		  }}
		  
		