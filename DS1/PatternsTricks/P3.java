package com.DS1.PatternsTricks;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//*****
//****
//***
//**
//*