package com.DS1.Arrays.Binarysearch;

public class intro {
    public static void main(String[] args) {
        int[] arr = {10,12,14,15,17,18,24,34,36};
        int target = 17;
        int ans = binary(arr, target);
        System.out.println(ans);
    }

    /// Function that returns the index.
    static int binary(int[] arr, int target){
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

        return -1;
    }
}
