package com.DS2.Strings;

import java.util.Scanner;

public class RevWordString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();


        // APPROACH 1 -> Using Spilt method.
        String[] words = s.split(" ");

        for (int i=words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }

        // APPROACH 2 -> Creating substrings and adding.
        String output = "";
        int i = s.length()-1;
        int end = s.length();

        while (i >= 0){
            if (s.charAt(i) == ' '){
                output += s.substring(i+1, end) + " ";
                end = i;
            }
            i--;
        }

        output += s.substring(i+1, end);
        System.out.println(output);
    }
}
