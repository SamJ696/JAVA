package com.DS1.Strings;

public class Comparison {
    public static void main (String[] args){
        String a = "Samyak";
        String b = "Samyak";

        System.out.println(a == b);

        // HOW TO MAKE TWO DIFFERENT OBJECTS OF SAME STRINGS. (FORCE METHOD).

        String c = new String("Java");
        String d = new String("Java");
        System.out.println(c == d);

        System.out.println(c.equals(d));
        // This function only  compares the string.
        // Does not matter if variables are pointing to same object or not.


        System.out.println(c.charAt(0));
        // Will print character at that index.
    }
}




//  COMPARISON OF STRINGS.
// == Method -->  If both Strings are same and variables are pointing to same object in heap then this will give true.




