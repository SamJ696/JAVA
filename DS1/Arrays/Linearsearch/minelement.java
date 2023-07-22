package com.DS1.Arrays.Linearsearch;

public class minelement {
    public static void main(String[] args) {
        int[] arr = {23,45,2,456,12567,12,5,1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans=arr[0];
        if (arr.length == 0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]<ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
