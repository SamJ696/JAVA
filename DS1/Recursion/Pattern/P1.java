package com.DS1.Recursion.Pattern;
import java.util.Scanner;


// *****
// ****
// ***
// **
// *


public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        pattern1(n,0);
    }

    static void pattern1(int row, int col){

        if (row==0){
            return;
        }

        if (col<row){
            System.out.print("*");
            pattern1(row,col+1);
        }

        else {
            System.out.println();
            pattern1(row-1,0);
        }
    }
}
