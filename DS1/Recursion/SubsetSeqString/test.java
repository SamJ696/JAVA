package com.DS1.Recursion.SubsetSeqString;

public class test {
    public static void main(String[] args) {
        String ans = skip("baccad", 0, 'c');
        System.out.println(ans);
    }

    static String fans = "";

    static String skip(String s, int i, char ch){

        if (i == s.length()-1){
            if (s.charAt(i) == ch){
                return fans;
            }

            else {
                fans += s.charAt(i);
                return fans;
            }
        }

        if (s.charAt(i) == ch){
            return skip(s, i+1, ch);
        }

        fans += s.charAt(i);
        return skip(s, i+1, ch);
    }
}
