package com.DS2.Recursion1;

import java.util.Scanner;

public class ArrayFirstIdx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int ans = firstIdx(arr, 0, 8);
        System.out.println(ans);
    }

    private static int firstIdx(int[] arr, int i, int target) {
        if (i == arr.length){
            return -1;
        }

        else if (arr[i] == target){
            return i;
        }

        return firstIdx(arr, i+1, target);
    }
}
