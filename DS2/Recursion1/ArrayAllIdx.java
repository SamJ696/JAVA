package com.DS2.Recursion1;

import java.util.Scanner;

public class ArrayAllIdx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        allIdx(arr, 0, 8);

    }

    private static void allIdx(int[] arr, int i, int target) {
        if (i == arr.length){
            return;
        }

        else if (arr[i] == target){
            System.out.print(i + " ");
        }

        allIdx(arr, i+1, target);
    }
}
