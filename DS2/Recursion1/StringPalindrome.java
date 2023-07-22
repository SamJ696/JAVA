package com.DS2.Recursion1;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        boolean ans = checkPalindrome(s, 0, s.length()-1);
        System.out.println(ans);
    }

    private static boolean checkPalindrome(String s, int start, int end) {
        if (start >= end){
            return true;
        }

        else if (s.charAt(start) != s.charAt(end)){
            return false;
        }

        return checkPalindrome(s, start+1, end-1);
    }
}
