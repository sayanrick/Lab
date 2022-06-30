package com.java;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an Armstrong number or not:- ");
        int n = sc.nextInt();

        int originalNum, rem;
        int res = 0;

        originalNum = n;

        while (originalNum != 0){
            rem = originalNum % 10;
            res += Math.pow(rem, 3);
            originalNum /= 10;
        }

        if (res == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
