package com.DS1.Recursion.Pattern;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        pattern2(n,0);

    }

    static void pattern2(int row, int col){
        if (row==0){
            return;
        }

        if (col<row){
            pattern2(row,col+1);
            System.out.print("*");
        }

        else {
            pattern2(row-1,0);
            System.out.println();
        }
    }
}
