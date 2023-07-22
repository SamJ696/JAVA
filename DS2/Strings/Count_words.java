package com.DS2.Strings;

import java.util.Scanner;

public class Count_words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int count = 1;

        if (str.isEmpty()){
            System.out.println(0);
        }

        else {
            for (int i=0; i<str.length(); i++){
                if (str.charAt(i) == ' '){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}

