package com.DS1.OOP.LambdaFunctions16;

import java.util.ArrayList;

public class LambdaFunc1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // Inside the foreach loop first one is parameter and after arrow is task.
        arr.forEach((item) -> {
            System.out.println(item*2);
        });
    }

    // Lambda Functions are inline functions.
    // Same as arrow functions in JS.

    static int sum(int a,int b){
        return a+b;
    }
}
