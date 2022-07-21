package Lab_Session_21st_July;

import java.util.Arrays;

public class ElementPresentOrNotInAnArray {
	
	public static void main(String[] args) {
		int arr[] = {1789, 2035, 1899, 1456, 2013}; // declaring an array
		
		System.out.println(arrayContains(2013, arr));
		
		}
	
	static int arrayContains(int n, int arr[]) { // passing a number and an array as argument
		for(int i = 0; i<arr.length; i++) { // loop to iterate through the array
			if(arr[i] == n) // if i-th element is equal to n then it will return the element   
				return n;
	}
		return -1; // otherwise will return -1 if the element is not found
}
}
