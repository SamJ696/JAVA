package com.DS2.Recursion2;

import java.util.Scanner;

public class StringRemoveX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        String ans = removeX(s);
        System.out.println(ans);
    }

    private static String removeX(String s) {
        if (s.length() < 1){
            return "";
        }

        if (s.charAt(0) == 'x'){
            return removeX(s.substring(1));
        }

        else {
            return s.charAt(0) + "" + removeX(s.substring(1));
        }
    }
}
