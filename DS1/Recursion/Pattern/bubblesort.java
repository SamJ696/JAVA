package com.DS1.Recursion.Pattern;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        sortbubble(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void sortbubble(int[] arr, int s, int e){
        if (s==0){
            return;
        }

        if (e<s){
            if (arr[e] > arr[e+1]){
                int temp = arr[e];
                arr[e] = arr[e+1];
                arr[e+1] = temp;
            }
            sortbubble(arr,s,e+1);
        }

        else {
            sortbubble(arr,s-1,0);
        }
    }
}
