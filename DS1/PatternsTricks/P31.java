package com.DS1.PatternsTricks;
import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = 2*n;

        for (int i=0; i<=n; i++){
            for (int col=0; col<=n; col++){
                int idx = Math.min(Math.min(i,col), Math.min(n-i, n-col));
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}


//0 0 0 0 0 0 0 0 0
//0 1 1 1 1 1 1 1 0
//0 1 2 2 2 2 2 1 0
//0 1 2 3 3 3 2 1 0
//0 1 2 3 4 3 2 1 0
//0 1 2 3 3 3 2 1 0
//0 1 2 2 2 2 2 1 0
//0 1 1 1 1 1 1 1 0
//0 0 0 0 0 0 0 0 0
