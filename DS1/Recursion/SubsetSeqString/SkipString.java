package com.DS1.Recursion.SubsetSeqString;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipApple("bcapplefapplefg"));
    }


    static String skipApple(String orig){
        if (orig.isEmpty()){
            return "";
        }

        if (orig.startsWith("apple")){
            return skipApple(orig.substring(5));
        }
        else {
            return orig.charAt(0) + skipApple(orig.substring(1));
        }
    }
}
