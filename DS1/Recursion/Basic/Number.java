package com.DS1.Recursion.Basic;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }

    static void print(int n){

        if (n==1){
            System.out.println(1);
            return;
        }

        System.out.print(n + " ");
        print(n-1);
    }
}
