package com.DS2.Recursion1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int ans = sumArray(arr, 0);
        System.out.println(ans);
    }

    private static int sumArray(int[] arr, int i) {
        if (i == arr.length){
            return 0;
        }

        return arr[i] + sumArray(arr, i+1);
    }
}
