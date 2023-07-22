package com.DS1.Recursion.Basic;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Reverse(n);
        System.out.println(sum);
    }

    static int sum = 0;
    static void Reverse(int n){
        if (n==0){
            return;
        }

        int rem = n%10;
        sum = sum*10 + rem;
        Reverse(n/10);
    }
}



