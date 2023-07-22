package com.DS2.Recursion1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int ans = factorial(n);
        System.out.println(ans);
    }

    private static int factorial(int n) {
        if (n == 1){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
