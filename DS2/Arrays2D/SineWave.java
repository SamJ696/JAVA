package com.DS2.Arrays2D;
import java.util.Scanner;

public class SineWave {
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

        for (int j=0; j<m; j++){
            if (j % 2 == 0){
                for (int i=0; i<n; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }

            else {
                for (int i=n-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
