package com.DS1.Recursion.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {3,45,3,3,1,5,3};
        List<Integer> idx = new ArrayList<Integer>();
        List<Integer> ans = Linear_Multiple(arr, 3, 0, idx);
        System.out.println(ans);

        int ans2 = Linear(arr, 0, 3);
        System.out.println(ans2);

    }

    public static int Linear(int[] arr, int index, int target){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return Linear(arr, index + 1, target);
    }



    public static List<Integer> Linear_Multiple(int[] arr, int target, int index, List<Integer> idx){
        if (index == arr.length){
            return idx;
        }

        if (arr[index] == target){
            idx.add(index);
        }

        return Linear_Multiple(arr, target, index + 1, idx);
    }
}
