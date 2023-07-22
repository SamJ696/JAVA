package com.DS1.MathsBit.Bitwise;

import java.util.Scanner;

public class Checkpower2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if ((n&(n-1))==0){
            System.out.println("Power of 2");
        }
        else {
            System.out.println("Not a power of 2");
        }
    }
}
