package com.DS1.OOP.Polymorphism8;

public class Numbers {

    double sum (double a  , int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers num1 = new Numbers();

        num1.sum(2,3);
        num1.sum(12,3,4);
        // AT COMPILE TIME IT KNOWS WHICH FUNCTION TO RUN.
        // THIS IS KNOWN AS COMPILE TIME OR STATIC POLYMORPHISM.
    }
}
