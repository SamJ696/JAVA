package com.DS1.Recursion.Practice;

public class SkipChar3 {
    public static void main(String[] args) {
        String str = "baccad";
        String temp = "";
        String ans = Skip(str, 0, temp);

        System.out.println(ans);
    }

    public static String Skip(String str, int index, String ans){
        if (index == str.length()){
            return ans;
        }

        if (str.charAt(index) != 'a'){
            ans += str.charAt(index) + "";
        }

        return Skip(str, index + 1, ans);
    }
}
