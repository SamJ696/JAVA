package com.DS1.MathsBit.Bitwise;

import java.util.Scanner;

public class Pascalrowsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = 1<<(n-1);

        System.out.println(ans);
    }
}
