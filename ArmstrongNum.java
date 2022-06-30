package com.java;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an Armstrong number or not:- ");
        int n = sc.nextInt();

        int originalNum, remainder;
        int result = 0;

        originalNum = n;

        while (originalNum != 0){
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        if (result == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
