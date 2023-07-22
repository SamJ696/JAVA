package com.DS1.Recursion.Arrays;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,6,9,8,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }

            while (arr[e] > pivot){
                e--;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Now we want to sort remaining parts of the array.
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
