/*
2) Take a variable from the scanner class 
Given two strings of lowercase a and b
i) calculate the sum of length of two strings a and b 
ii) Determine if a is greater than b 
iii) then print true else vice versa
iv) capitalise the 1st letter of a and b and print together
*/

package String;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:- ");
		String s1 = sc.next();
		s1 = s1.toLowerCase();
		System.out.println("Enter second String:- ");
		String s2 = sc.next();
		s2 = s2.toLowerCase();
		operation(s1, s2);

	}

	static void operation(String s1, String s2) {
		int lOfs1 = s1.length();
		int lOfs2 = s2.length();
		int sum = lOfs1 + lOfs2;

		System.out.println("Length of first and second string is- " + sum);
		if (s1.compareTo(s2) > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2.substring(0, 1).toUpperCase()
				+ s2.substring(1));
	}

}
