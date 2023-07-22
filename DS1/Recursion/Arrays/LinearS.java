package com.DS1.Recursion.Arrays;

import java.util.ArrayList;

public class LinearS {
    public static void main(String[] args) {
        int[] arr = {1,2,2,45,6,7,28};
        System.out.println(Linear(arr,0,45));
        LinearAll(arr,0,2);
        System.out.println(ans);
    }


    static ArrayList<Integer> ans = new ArrayList<>();
    static int Linear(int[] arr, int index, int target){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }



        return Linear(arr, index+1, target);
    }

    static void LinearAll(int[] arr, int index, int target){
        if (index == arr.length){
            return;
        }

        if (arr[index] == target){
            ans.add(index);
        }

        LinearAll(arr, index+1, target);
    }
}
