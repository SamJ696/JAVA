package com.DS1.Recursion.Practice;

import java.util.ArrayList;

public class SubSeq4 {
    public static void main(String[] args) {
        SubS("", "abc");

        System.out.println("ArrayList ans : " + SubsArrList("", "abc").toString());
    }

    public static void SubS(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        SubS(p + ch, up.substring(1));
        SubS(p, up.substring(1));
    }

    public static ArrayList<String> SubsArrList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=  new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = SubsArrList(p + ch, up.substring(1));
        ArrayList<String> right = SubsArrList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
