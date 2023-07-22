package com.DS2.Recursion2;

import java.util.Scanner;

public class StringPairStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        String ans = pairStar(s);
        System.out.println(ans);
    }

    private static String pairStar(String s) {
        if (s.length() <= 1){
            return s;
        }

        if (s.charAt(0) == s.charAt(1)){
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        }

        else {
            return s.charAt(0) + pairStar(s.substring(1));
        }
    }
}
