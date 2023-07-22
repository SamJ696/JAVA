package com.DS1.Arrays.Sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5,1,8,3};

        // ALSO KNOWN AS SINKING AND EXCHANGE SORT.
        // IT IS A STABLE SORTING ALGORITHM.
        // When the original order of same elements is maintained it is Stable Sorting.
        // When the order is disturbed and array is sorted it is unstable sorting.

        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        // Run the steps n-1 times.

        for (int i=0; i<arr.length; i++){
            // In every step max element will come at last position.
            for (int j=1; j<arr.length-i; j++){
                // Swap if item is smaller than previous.
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
