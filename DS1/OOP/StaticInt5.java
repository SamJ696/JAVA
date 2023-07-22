package com.DS1.OOP;

public class StaticInt5 {
    static int a = 4;
    static int b;

    // WILL ONLY RUN ONCE WHEN THE FIRST OBJECT WAS CREATED I.E WHEN THE CLASS IS LOADED FOR FIRST TIME.
    static {
        System.out.println("I am in Static Block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInt5 obj = new StaticInt5();
        System.out.println(StaticInt5.a + " " + StaticInt5.b);

        StaticInt5.b += 3;
        StaticInt5 obj2 = new StaticInt5();
        System.out.println(StaticInt5.a + " " + StaticInt5.b);
    }
}
