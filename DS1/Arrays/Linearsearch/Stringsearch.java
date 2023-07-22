package com.DS1.Arrays.Linearsearch;

public class Stringsearch {
    public static void main(String[] args) {
        String name = "Samyak";
        char target = 'y';
        System.out.println(search(name, target));
        System.out.println(search2(name,target));

    }

    static boolean search2(String str, char target){
        if (str.length()==0){
            return false;
        }

        // For using modified for loop we need collection. Reason why str.toCharArray function is used.
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }

        return false;
    }

    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }

        for (int i=0; i<str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
