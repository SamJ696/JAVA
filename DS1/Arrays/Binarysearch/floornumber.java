package com.DS1.Arrays.Binarysearch;

public class floornumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,14,16,18};
        int target = 13;

        // FLOOR IS THE LARGEST ELEMENT SMALLER OR EQUAL TO TARGET ELEMENT.
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
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

        return e;
    }
}
