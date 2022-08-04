package Aug_4th_Lab_Session;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchQuestion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:- ");
		int x = sc.nextInt(); // taking value of first userInput
		int y = sc.nextInt(); // taking value of second userInput
		try {
			System.out.println(x/y);  
			
		}
		catch(InputMismatchException e) { //exception due to invalid input
			e.printStackTrace();
		}
		catch(ArithmeticException e) { // exception 
			e.printStackTrace();
		}
		catch(Exception e) { // all other exception can be fetched by this class Exception
			e.printStackTrace();
		}
		
	}

}
