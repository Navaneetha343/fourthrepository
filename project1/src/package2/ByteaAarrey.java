package package2;

public class ByteaAarrey {

    public static void main(String[] args)
    {
  
        // Initializing String
        String ss = "Hello GeeksforGeeks";
  
        // Display the string before conversion
        System.out.println("String: " + ss);
  
        // Converting string to byte array
        // Using getBytes() method
        byte[] res = ss.getBytes();
  
        System.out.println("Byte Array:");
  
        // Display the string after conversion
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
