package com.DS2.Arrays2D;

import java.util.Scanner;

public class BoundarySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[n][m];
        int sum = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (i == 0 || j == 0 || i == n-1 || j== m-1){
                    sum += arr[i][j];
//                    System.out.println(i + " " + j + " " + arr[i][j]);
                }
            }
        }

        System.out.println(sum);
    }
}
