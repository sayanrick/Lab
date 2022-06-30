package com.java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from the user
        System.out.println("Enter a year to check leap year or not:- ");
        int year = sc.nextInt();

        // If the given year is leap year then it will go inside if block and will print
        // whatever the output is
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println(year + " is Leap Year");
        }
        // otherwise the control will go inside else block and wll print whatever te output is
        else{
            System.out.println(year + " is not Leap Year");
        }
    }
}
