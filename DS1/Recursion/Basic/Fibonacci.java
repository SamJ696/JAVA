package com.DS1.Recursion.Basic;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Fibo(n));
    }

    static int Fibo(int n){
        // Base Condition
        if (n<2){
            return n;
        }

        return Fibo(n-1) + Fibo(n-2);
    }
}
