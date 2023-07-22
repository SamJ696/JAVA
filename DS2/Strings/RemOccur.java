package com.DS2.Strings;

import java.util.Scanner;

public class RemOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char ch = in.next().charAt(0);

        String ans = "";

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != ch){
                ans += s.charAt(i) + "";
            }
        }

        System.out.println(ans);
    }
}
