package com.DS2.Recursion1;

import java.util.Scanner;

public class GPSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        double ans = Sum(n);
        System.out.println(ans);
    }

    private static double Sum(int n) {
        if (n == 0){
            return 1;
        }

        return Sum(n - 1) + 1/Math.pow(2,n);
    }
}
