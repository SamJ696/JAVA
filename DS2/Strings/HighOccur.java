package com.DS2.Strings;

import java.util.Scanner;

public class HighOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char[] freq = new char[26];

        for (int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0;
        int ans = 0;

        for (int i=0; i<freq.length; i++){
            if (freq[i] > max){
                max = freq[i];
                ans = i;
            }
        }

        System.out.println("Answer : " + (char)('a' + ans));
    }
}
