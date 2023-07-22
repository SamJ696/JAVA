package com.DS1.Arrays.Linearsearch;

public class maxwealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,5},
                {7,8},
                {7,5}
        };

        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[][] arr){
        int sum=0;
        int fsum=0;

        for (int i=0; i<arr.length; i++){
            sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum>fsum){
                fsum = sum;
            }
        }

        return fsum;
    }
}
