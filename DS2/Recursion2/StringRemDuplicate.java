package com.DS2.Recursion2;

import java.util.Scanner;

public class StringRemDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        String ans = removeDupicate(s);
        System.out.println(ans);
    }

    private static String removeDupicate(String s) {
        if (s.length() <= 1){
            return s;
        }

        if (s.charAt(0) == s.charAt(1)){
            return removeDupicate(s.substring(1));
        }

        else {
            return s.charAt(0) + removeDupicate(s.substring(1));
        }
    }
}
