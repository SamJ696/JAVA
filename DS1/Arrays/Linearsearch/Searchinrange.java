package com.DS1.Arrays.Linearsearch;

public class Searchinrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,23,45,29,34,19,12,43,42};
        int target = 23;
        int n1 = 5;
        int n2 = 9;
        System.out.println(searchrange(arr, target, n1, n2));
    }

    static int searchrange(int[] arr, int target, int index1, int index2){
        if (arr.length == 0){
            return -1;
        }

        for (int i=index1; i<=index2; i++){
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
