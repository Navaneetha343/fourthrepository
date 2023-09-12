package package1;

public class ReverseArrey {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=arr.length; j>i; j--) {
				System.out.println(arr[j]);
			}
			//arr[i]=reversearr[j];
			
			//reversearr[j]=arr[i];
		}
		//System.out.println(arr[i]);
	}
}
