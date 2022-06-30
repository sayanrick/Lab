package com.java;

import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of pyramid:- ");
        int n = in.nextInt();

        pyramid(n);
    }
    static void pyramid(int n){
        for (int i = 0; i < n; i++) {
            // for printing white space
            for (int j = n-i; j >1; j--) {
                System.out.print(" ");
            }
            // dor printing *
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
