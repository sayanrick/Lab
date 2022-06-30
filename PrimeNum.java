package com.java;

import java.util.Scanner;
public class  PrimeNum{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if the number is a prime number or not:- ");
        int n = sc.nextInt();
        checkPrime(n);
    }

    public static void checkPrime(int n) {
        int count = 0;

        // negative numbers, 0 and 1 are not prime
        if (n < 2)
            System.out.println ("The given is number " + n + " is not prime");

        // checking the number of divisors between [1, n]
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count += 1;
        }

        // if count of divisors greater than 2 then its not prime
        if (count > 2)
            System.out.println ("The given number " + n + " is not prime");

        else
            System.out.println ("The given number " + n + " is prime");
    }
}
