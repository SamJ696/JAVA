package com.DS2.Recursion1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int ans = sumDigits(n);
        System.out.println(ans);
    }

    private static int sumDigits(int n) {
        if (n <= 0){
            return 0;
        }

        return n%10 + sumDigits(n/10);
    }
}
