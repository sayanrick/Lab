package Lab_Session_21st_July;

public class OddInexString {
	
	public static void main(String[] args) {
		
		String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h"}; // declaring an array of string
		for(int i=0; i<arr.length; i += 2) // it will iterate through the array and will print the odd elements of the array
			System.out.print(arr[i] + ", ");
		}
	}
