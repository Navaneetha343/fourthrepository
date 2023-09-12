package package1;

public class Reversearray2 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int size=0;
	//	int[] reverseArr=null;
		size=arr.length;
		int[] reverseArr=new int[size];
		
		
		for(int i=0,j=size-1; i<size;i++,j--) {
			
			reverseArr[i]=arr[j];
			
			//reversearr[j]=arr[i];
		}for(int i=0;i<size;i++)
		System.out.println(reverseArr[i]);
	}
}



