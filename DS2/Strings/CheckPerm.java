package com.DS2.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[t.length()];

        if (s.length() != t.length()){
            System.out.println("False");
        }

        for (int i=0; i<s.length(); i++){
            arr1[i] = s.charAt(i);
            arr2[i] = t.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int flag = 1;

        for (int i=0; i<arr1.length; i++){
            if (arr1[i] != arr2[i]){
                System.out.println("False");
                flag=0;
                break;
            }
        }

        if (flag == 1){
            System.out.println("True");
        }
    }
}
