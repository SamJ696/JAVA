package com.DS2.Recursion1;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = digits(n);
        System.out.println(ans);
    }

    private static int digits(int n) {
        if (n <= 0){
            return 0;
        }

        return 1 + digits(n/10);
    }
}
