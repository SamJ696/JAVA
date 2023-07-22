package com.DS1.MathsBit.Bitwise;

import java.util.Scanner;

public class PosRightmost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = -1;

        for (int i=1; i<num; i++){
            int mask = 1<<(i-1);
            if ((num|mask)==1){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
