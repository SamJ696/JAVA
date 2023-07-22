package com.DS1.Recursion.Basic;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Sum(n));
    }

    static int Sum(int n){
        if (n==0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        return n+Sum(n-1);
    }
}
