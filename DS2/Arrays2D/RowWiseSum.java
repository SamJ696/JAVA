package com.DS2.Arrays2D;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;

        for (int i=0; i<n; i++){
            sum = 0;
            for (int j=0; j<m; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
