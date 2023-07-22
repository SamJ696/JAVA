package com.DS1.Recursion.Practice;

import java.util.Scanner;

public class SortArray1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6};
        System.out.println(ifSort(arr, 0));

    }

    public static boolean ifSort(int[] arr, int index){
        if (index == arr.length - 1){
            return true;
        }

        return arr[index] <= arr[index + 1] && ifSort(arr, index + 1);
    }
}
