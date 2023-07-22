package com.DS1.PatternsTricks;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i=1; i<=(2*n)-1; i++){
            if (i<=n){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j=0; j<=(2*n)-i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

//*
//**
//***
//****
//*****
//****
//***
//**
//*
