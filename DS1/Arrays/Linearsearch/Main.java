package com.DS1.Arrays.Linearsearch;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,-11,93};
        int target = -11;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    // Search in the Array. Return the index if target is found else -1.
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i=0; i< arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }

        // This statement will execute if none of above return statements have been executed.
        return -1;
    }
}
