package com.DS1.MathsBit.Bitwise;
import java.util.Scanner;

public class FindSingle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int[] arr = {2,3,6,4,2,6,4};

        for (int i : arr){
            n ^= i;
        }

        System.out.println(n);
    }
}
