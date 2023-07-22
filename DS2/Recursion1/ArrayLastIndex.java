package com.DS2.Recursion1;

import java.util.Scanner;

public class ArrayLastIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int ans = lastIdx(arr, n-1, 8);
        System.out.println(ans);
    }

    private static int lastIdx(int[] arr, int i, int target) {
        if (i < 0){
            return -1;
        }

        else if (arr[i] == target){
            return i;
        }

        return lastIdx(arr, i-1, target);
    }
}
