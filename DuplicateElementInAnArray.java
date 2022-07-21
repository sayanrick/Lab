package Lab_Session_21st_July;

public class DuplicateElementInAnArray {
	public static void main(String[] args) {
		int arr[] = {5, 2, 7, 7, 5, 9, 4, 2, 9}; // declaring an array with duplicate elements inside it
		
		System.out.println("Duplicate elements are:- ");
		for (int i=0; i<arr.length; i++) { // outer loop will select an element
			for (int j= i+1; j<arr.length; j++) { // Inner loop will check if there is any duplicate value if true then it will print the number
				if(arr[i] == arr[j])
					System.out.print(arr[j] + ", "); // this line will print the element
				
	}
		}
	}
}
	

