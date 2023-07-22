package com.DS2.Strings;

import java.util.Scanner;

public class RevEachWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String temp = "";
        String ans = "";

        int prevIdx = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                ans += RevWord(s.substring(prevIdx,i)) + " ";
                prevIdx = i + 1;
            }
        }

        ans += RevWord(s.substring(prevIdx)) + "";
        System.out.println(ans);
    }

    public static String RevWord(String s){
        String ans = "";

        for (int i = s.length()-1; i>=0; i--){
            ans += s.charAt(i) + "";
        }

        return ans;
    }
}
