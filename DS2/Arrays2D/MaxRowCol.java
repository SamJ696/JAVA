package com.DS2.Arrays2D;

import java.util.Scanner;

public class MaxRowCol {
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

        int Rsum = 0;
        int Csum = 0;
        int Rsummax = 0;
        int Csummax = 0;
        int Ridx = 0;
        int Cidx = 0;

        for (int j=0; j<m; j++){
            Rsum = 0;
            Csum = 0;
            for (int i=0; i<n; i++) {
                Rsum += arr[j][i];
                Csum += arr[i][j];
            }
            if (Rsum > Rsummax){
                Rsummax = Rsum;
                Ridx = j;
            }

            if (Csum > Csummax){
                Csummax = Csum;
                Cidx = j;
            }
        }

        if (Csummax > Rsummax){
            System.out.println("Column " + Cidx + " " +  Csummax);
        }

        else {
            System.out.println("Row " + Ridx + " " + Rsummax);
        }
    }
}
