package callingMethods;

public class Individual {
	static String string;
    public static void main(String[] args)
    {run();
    	
    }
 public static void  run() {
        string = "GeeksforGeeks";
 
        // Displays individual characters from given string
        System.out.println(
            "Individual characters from given string: ");
 
        // Iterate through the given string to
        // display the individual characters
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}
