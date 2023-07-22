package com.DS2.Recursion1;

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        print(n);
    }

    public static void print(int n) {
        if (n == 1){
            System.out.println(n + " ");
            return;
        }

        print(n - 1);
        System.out.println(n + " ");
    }
}
