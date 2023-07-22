package com.DS1.Recursion.SubsetSeqString;

public class Subsets {
    public static void main(String[] args) {
        subseq("", "abc");
    }

    static void subseq(String ans, String orig){
        if (orig.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = orig.charAt(0);

        // Take 1st element and then either add it or ignore it.
        subseq(ans + ch, orig.substring(1));
        subseq(ans, orig.substring(1));
    }
}
