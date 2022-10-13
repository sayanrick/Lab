/*
Given a number N for each integer i in the range of 1toN print one value per line from the following:
i)if i is a multiple of 3 and 5 print GoodMorning
ii) if i is  a multiple of 3 not 5 print Good
iii) if i is a multiple of 5 not 3 print Morning
iv) if i is not a multiple of 3 and 5 then print the value of i
*/

package numbers;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range:- ");
		int start = sc.nextInt();
		System.out.println("Enter Ending range:- ");
		int end = sc.nextInt();
		conditionCheck(start, end);

	}

	static void conditionCheck(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Good Morning");
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Good");
			} else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println("Morning");
			} else {
				System.out.println(i);
			}
		}
	}

}
