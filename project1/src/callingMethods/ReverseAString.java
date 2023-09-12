package callingMethods;

public class ReverseAString {
	String str;
	String reverse= "";
	String result;
	public static void main(String[] args) {
		//String str ;
		 ReverseAString result = new ReverseAString();
		 result.str="Navaneetha";
		String arr1= result.ReverseAString();
		 System.out.println(arr1);
			}

	public String ReverseAString() {
	
		
	for(int i= str.length()-1;i>=0;i--) 
		reverse= reverse+str.charAt(i);
		
		return reverse;
	}
		
	}


