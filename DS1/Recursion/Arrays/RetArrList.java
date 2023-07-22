package com.DS1.Recursion.Arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class RetArrList {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,5,6,7,8};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Occur(arr,5,0,ans);
        System.out.println(ans);
    }

    static ArrayList<Integer> Occur(int[] arr, int target, int index, ArrayList<Integer> ans){


        if (index == arr.length){
            return ans;
        }

        if (arr[index] == target){
            ans.add(index);
        }

        return Occur(arr,target,index+1, ans);
    }
}
