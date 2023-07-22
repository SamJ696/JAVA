package com.DS2.Recursion1;

import java.util.Scanner;

public class ArrayNumCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        boolean ans = findNum(arr, 0, 5);
        System.out.println(ans);
    }

    private static boolean findNum(int[] arr, int i, int target) {
        if (i == arr.length){
            return false;
        }

        else if (arr[i] == target){
            return true;
        }

        return findNum(arr, i+1, target);
    }
}
