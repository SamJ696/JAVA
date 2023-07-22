package com.DS1.Arrays.Linearsearch;

public class evendigits {
    public static void main(String[] args) {
        int[] arr = {12 ,13, 14, 15, 1,2,3,4,5};
        int ans = findeven(arr);
        System.out.println(ans);
    }

    // Function to count numbers that have even number of digits.
    static int findeven(int[] arr){
        int count=0;

        for (int num : arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // Function to check if a number has even digits or not.
    static boolean even (int num){

        if(num<0){
            num = num*-1;
        }

        if (num == 0){
            return false;
        }

        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }

        if (count%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
