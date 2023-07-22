package com.DS1.Recursion.Arrays;

import java.util.Scanner;

public class IfSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,7,7};

        System.out.println(Sort(arr,0));
    }

    static boolean Sort(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index]<=arr[index+1] && Sort(arr, index+1);
    }
}
