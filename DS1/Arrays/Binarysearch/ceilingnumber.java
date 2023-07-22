package com.DS1.Arrays.Binarysearch;

public class ceilingnumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        // CEILING IS THE SMALLEST NUMBER WHICH IS GREATER THAN OR EQUAL TO TARGET NUMBER.

        int target = 17;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target){
        int s=0;
        int e = arr.length-1;
        int mid=0;

        while (s<=e){
            mid = s + (e-s)/2;
            if (arr[mid]==target){
                return mid;
            }

            else if (arr[mid]>target){
                e = mid-1;
            }

            else if (arr[mid]<target){
                s = mid+1;
            }
        }

        return s;
    }
}
