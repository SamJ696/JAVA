package com.DS2.Strings;

import java.util.Scanner;
import java.util.Stack;

public class RemConsecDup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        Stack<Character> ans = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if (ans.empty()){
                ans.push(s.charAt(i));
            }

            else if (!ans.contains(s.charAt(i))){
                ans.push(s.charAt(i));
            }
        }

        String temp = "";

        while (!ans.empty()){
            temp += ans.pop() + "";
        }

        String fans = "";
        for (int i=temp.length()-1; i>=0; i--){
            fans += temp.charAt(i) + "";
        }

        System.out.println(fans);
    }
}
