package com.DS1.Recursion.SubsetSeqString;

public class Skipchar {
    public static void main(String[] args) {

        skip("", "baccdah");
    }


    static void skip(String ans, String orig){
        if (orig.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = orig.charAt(0);

        if (ch=='a'){
            // Substring method returns string from index onwards. Here 1st will be removed every time.
            skip(ans, orig.substring(1));
        }

        else {
            skip(ans + ch, orig.substring(1));
        }
    }
}
