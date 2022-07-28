package Lab_Session_28th_July;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
	public static void main(String args[]) {
		
		// Taking all the valid and invalid ip address to see the result
		String arr[] = {"000.12.12.034", "121.234.12.12", "23.45.12.56",
				"000.12.12.034",
				"121.234.12.12","23.45.12.56","Hello.IP","255.1.0.256",
				"123.45","Im.not.IP.address", "999.999.999.999"};
		
		//loop to iterate through the elements and print the values
		for (int i=0; i<arr.length; i++)
		System.out.println(checkIPAdd(arr[i]));
	}
	
	public static boolean checkIPAdd(String s) {
		final String zeroTo255 
        = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

		 final String IP_REGEXP
         = zeroTo255 + "\\." + zeroTo255 + "\\."
         + zeroTo255 + "\\." + zeroTo255;
		 
		// Compile the ReGex
	        Pattern p = Pattern.compile(IP_REGEXP);
	        
	     // Find match between given string
	     // & regular expression
	        Matcher m = p.matcher(s);
	        
	        
	        if (m.matches()) {
	           return true;
	        }
	        return false; 
	}

}
