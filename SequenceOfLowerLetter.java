package Lab_Session_28th_July;

import java.util.regex.*;

public class SequenceOfLowerLetter {
	public static void main(String[] args) {
		String s = "java_exercises";
		String s1 = "Java_Exercises";
		
		// Calling the method to see the output
		checkRegex(s);
		checkRegex(s1);
			
	}
	
	public static void checkRegex(String s) {
		 String regex = "^[a-z]+_[a-z]+$";
		 
		// Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	        
	     // Find match between given string
	     // & regular expression
	        Matcher m = p.matcher(s);
	        
	        // if true then it will print if block otherwise else block
	        if (m.matches())
	            System.out.println("Found a match");
	        else
	            System.out.println("Not matched");
	}
	

}
