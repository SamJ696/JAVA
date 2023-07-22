package com.DS1.Recursion.Arrays;

// 1. Divide array into two parts.
// 2. Get both parts sorted via recursion.
// 3. Merge two sorted parts by using 2 iterators.


import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {

        int[] arr = {8,3,4,12,5,6};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0, j=0, k=0;

        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // If one of the arrays have some remaining elements then for adding them.
        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
