package com.DS1.Arrays.Sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,3,1,8,6};
        selection(arr);

        // IT IS UNSTABLE SORTING ALGORITHM.
        // HERE WE ARE PICKING MAX ELEMENT AND THEN SWAPPING THE LAST INDEX ELEMENT WITH IT.
        // FUNC FOR SWAP AND MAX INDEX ARE BELOW.

        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i=0; i<arr.length; i++){
            // Find max element and swap with correct index.
            int last = arr.length-i-1;
            int maxInd = getMax(arr,0,last);
            swap(arr,maxInd,last);
        }
    }

    // THIS FUNCTION IS HELPING IN FINDING INDEX OF MAX ELEMENT.
    static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i=start; i<=end; i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    // THIS FUNCTION IS HELPING IN SWAPPING OF ELEMENTS.
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
