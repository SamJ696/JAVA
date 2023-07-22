package com.DS2.Recursion1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int ans = power(n1, n2);
        System.out.println(ans);
    }

    public static int power(int n1, int n2) {
        if (n2 == 1){
            return n1;
        }

        return n1 * power(n1, n2 - 1);
    }
}
