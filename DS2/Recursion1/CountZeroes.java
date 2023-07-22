package com.DS2.Recursion1;

import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int ans = Zeroes(n);
        System.out.println(ans);
    }

    private static int Zeroes(int n) {
        if (n <= 0){
            return 0;
        }

        if (n % 10 == 0){
            return 1 + Zeroes(n/10);
        }

        return Zeroes(n/10);
    }
}
