package com.DS1.Extras;
import java.util.Scanner;

public class prodexcept {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] nums = new int[n];

        for (int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        int[] ans = new int[nums.length];

        int prod=1;

        for (int i=0; i<nums.length; i++){
            prod=1;
            for (int j=0; j<nums.length; j++){
                if (j!=i){
                    prod = prod * nums[j];
                }
            }
            ans[i] = prod;
        }

        System.out.println(ans);
    }
}
