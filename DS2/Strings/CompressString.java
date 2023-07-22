package com.DS2.Strings;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String ans = "";
        int count = 1;

        ans += s.charAt(0) + "";

        for (int i=1; i<s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            }

            else {
                if (count > 1){
                    ans += count;
                    count = 1;
                }
                ans += s.charAt(i);
            }
        }

        if (count > 1){
            ans += count;
        }

        System.out.println(ans);
    }
}
