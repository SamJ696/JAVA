package com.DS1.MathsBit.Bitwise;
import java.util.Scanner;

public class IthBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();


        int num = 10;  // 1010 in binary.

        int mask = 1<<(pos-1);
        int ans = num & mask;

        System.out.println(ans);
    }
}
