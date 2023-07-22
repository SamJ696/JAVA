package com.DS1.HashTables;

import java.util.HashSet;
import java.util.Set;

public class firstRepeat {
    public static void main(String[] args) {
        String input = "green apple";

        var ans = repeatFirst(input);
        System.out.println(ans);
    }

    private static char repeatFirst(String s) {
        Set<Character> ans = new HashSet<>();

        for (int i=0; i<s.length(); i++){
            if (ans.contains(s.charAt(i))){
                return s.charAt(i);
            }

            ans.add(s.charAt(i));
        }

        return '.';
    }
}
