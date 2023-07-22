package com.DS2.Recursion2;

import java.util.Scanner;

public class StringReplaceChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        String ans = removeChar(s, 0, 'a', 'x');
        System.out.println(ans);
    }

    private static String removeChar(String s, int i, char c1, char c2) {
        if (i == s.length()){
            return "";
        }

        if (s.charAt(i) == c1){
            return c2 + "" + removeChar(s, i+1, c1, c2);
        }

        return s.charAt(i) + "" + removeChar(s, i+1, c1, c2);
    }
}
