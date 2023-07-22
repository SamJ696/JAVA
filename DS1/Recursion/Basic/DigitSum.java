package com.DS1.Recursion.Basic;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Dig(n));
    }

    static int Dig(int n){
        if (n==0){
            return 0;
        }

        return (n%10) + Dig(n/10);
    }
}
