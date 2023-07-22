package com.DS2.Recursion2;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        towerHanoi(2, 'a', 'b', 'c');
    }

    private static void towerHanoi(int i, char a, char b, char c) {
        if (i == 0){
            return;
        }

        towerHanoi(i-1, a, c, b);
        System.out.println(a + " " + c);
        towerHanoi(i-1, b, a, c);
    }
}
