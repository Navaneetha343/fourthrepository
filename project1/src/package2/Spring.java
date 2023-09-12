package package2;
//Java program to demonstrate how to convert String to
	// String Array using Regular Expression in Java
	 
	// Importing all classes from
	// java.util package
	import java.util.*;
	 
	// Importing Matcher class that searches through a text for
	// multiple occurrences of a regular expression 
	import java.util.regex.Matcher;
	 
	// Importing Pattern class
	import java.util.regex.Pattern;
	 
	// Importing Pattern class to compile regex
	 
	// Classv
public class Spring {
	
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Random string input
	        String gfg = "Welcome, to, GFG";
	 
	        // Splitting of string into characters and
	        // storing it in an array string
	        // separated by comma in between characters
	        String[] str = gfg.split(",");
	 
	        // Traversing the above array
	        // using for each loop
	        for (String s : str) {
	 
	            // Print the characters of the array
	            // formed from input string
	            System.out.println(s);
	        }
	    }
	}

