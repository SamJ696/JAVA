package com.DS2.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String rev = "";

        for (int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i) + "";
        }

        if (s.equals(rev)){
            System.out.println("True");
        }

        else {
            System.out.println("False");
        }

        // IF ANY STRING IS PRESENT IN STRING POOL (A PLACE WHERE STRINGS ARE STORED).
        // THEN THE NEW STRING WITH SAME VALUE WILL MOST LIKELY POINT TO ALREADY CREATED STRING.
        // THE REASON WHY STRINGS ARE IMMUTABLE BECAUSE OF SAME REFERENCE IF WE WILL CHANGE SOMETHING.
        // THEN IT WILL CHANGE FOR EVERYONE.
    }
}
