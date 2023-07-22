package com.DS2.Recursion2;

import java.util.Scanner;

public class StringReplacePi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        String ans = removePi(s);
        System.out.println(ans);
    }

    private static String removePi(String s) {
        if (s.length() <= 1){
            return s;
        }

        if (s.charAt(0) == 'p' && s.charAt(1) == 'i'){
            return "3.14" + removePi(s.substring(2));
        }

        else {
            return s.charAt(0) + "" + removePi(s.substring(1));
        }
    }
}
