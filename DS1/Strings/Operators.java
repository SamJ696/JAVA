package com.DS1.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'c');

        System.out.println("a" + "c");

        System.out.println('a' + 2);

        System.out.println((char)('a'+2));

        System.out.println("a" + 1);
        // Here Integer is converted into Wrapper Class so that it can call toString().
        // Basically 1 is converted into string at the end.


        System.out.println("Samyak" + new ArrayList<>());
        // IF ANYTHING OTHER THAN STRING IS CONCATENATED WITH A STRING THEN IT WILL BE CONVERTED INTO STRING IT WILL CALL toString() function.
        // + OPERATOR ONLY WORKS WHEN THERE IS AT LEAST 1 STRING.
        // THIS IS OPERATOR OVERLOADING. AS + IS PROVIDING US MORE FUNCTIONS.
    }
}
