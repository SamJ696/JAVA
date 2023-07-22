package com.DS1.Strings;

public class PalindromeProb {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(Palin((str)));
    }

    static boolean Palin(String str){
        str = str.toLowerCase();

        if (str.length()==0 || str==null){
            return true;
        }

        for (int i=0; i<str.length()/2; i++){
            char s = str.charAt(i);
            char e = str.charAt(str.length()-1-i);

            if (s!=e){
                return false;
            }
        }

        return true;
    }
}
