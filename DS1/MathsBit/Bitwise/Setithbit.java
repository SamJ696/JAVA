package com.DS1.MathsBit.Bitwise;

import java.util.Scanner;

public class Setithbit {
    public static void main(String[] args) {
        // Set ith bit means changing the bit to 1 at that position.
        int n = 10;
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();

        int mask = 1<<(pos-1);
        int ans = n|mask;

        System.out.println(ans);
    }
}
