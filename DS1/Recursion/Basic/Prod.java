package com.DS1.Recursion.Basic;

import java.util.Scanner;

public class Prod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Product(n));
    }

    static int Product(int n){
        if (n==1 || n==0){
            return 1;
        }

        return n*Product(n-1);
    }
}
