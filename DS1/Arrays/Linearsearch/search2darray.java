package com.DS1.Arrays.Linearsearch;

import java.util.Arrays;

public class search2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {2,4,5},
                {45,47,48,49},
                {32,34,35,36}
        };

        int target = 0;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
