package com.DS2.Strings;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        for (int i=0; i<s.length(); i++){
            for (int j=i; j<s.length(); j++){
                System.out.println(s.substring(i, j+1));
            }
        }
    }
}
