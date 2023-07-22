package com.DS1.OOP;

public class Wrapper2 {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 20;

        swap(a,b);

//        System.out.println(a + " " + b);

        final int x = 10; // x cannot be modified now in any way.

        final String name = "Sam";
        String name2 = name;
        name2 = "Samyak";
        System.out.println(name);
        System.out.println(name2);

    }

    static void swap (Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

//  In general, pass by value takes place in java when we swap two integers.
//  So in pass by value the value of original variables would not change.
//  In function the variable 'a' passed is limited to the function scope only.
//  So the original variable is not changed.
//  For that, pass by reference is required.
//  Integer class creates object so, ideally it should solve the problem.
//  But as Integer class is a final class, numbers won't be swapped if they are passed as Integers.

