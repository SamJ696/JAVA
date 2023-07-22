package com.DS1.MathsBit.Bitwise;

import java.util.Scanner;

public class MagicNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = 0;
        int base = 5;

        while (n>0){
            int last = n&1;
            n = n>>1;
            ans += base*last;
            base = base*5;
        }

        System.out.println(ans);
    }
}
