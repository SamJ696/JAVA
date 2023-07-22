package com.DS2.Recursion1;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int ans = multiply(n, m);
        System.out.println(ans);
    }

    private static int multiply(int n, int m) {
        if (m == 0){
            return 0;
        }

        return n + multiply(n, m - 1);
    }
}
