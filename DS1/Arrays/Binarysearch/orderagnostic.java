package com.DS1.Arrays.Binarysearch;

public class orderagnostic {
    public static void main(String[] args) {
        int[] arr = {20,18,17,16,14,12};
        int[] arr2 = {10,12,14,15,16,24,25};

        int ans = ogbs(arr, 17);
        int ans2 = ogbs(arr2, 15);

        System.out.println(ans);
        System.out.println(ans2);

    }

    static int ogbs(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int mid=0;

        // Find the order asc or desc.
        boolean isAsc;
        if (arr[s]<arr[e]){
            isAsc = true;
        }
        else {
            isAsc = false;
        }

        while (s<=e){
            mid = s + (e-s)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (arr[mid]>target){
                    e = mid-1;
                }

                else if(arr[mid]<target){
                    s = mid+1;
                }
            }

            else {
                if (arr[mid]<target){
                    e = mid-1;
                }

                else if(arr[mid]>target){
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}
