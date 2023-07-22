package com.DS1.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        Integer n = new Integer(56);
        System.out.println(n.toString());
        System.out.println(new int[]{1,2,3,4,5});
        // Above will not print array as internally it is checking for string and adding @ and random values.
        // To avoid this we use Arrays.toString() function.
        Scanner in = new Scanner(System.in);

        System.out.println(Arrays.toString(new int[]{2,3,4,5}));
    }
}
