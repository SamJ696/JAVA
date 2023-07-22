package com.DS1.OOP;

public class InnerClasses6 {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sam");
        Test b = new Test("Bro");
    }

    // FOR CREATING SINGLETON CLASS WE WOULD DEFINE A CLASS AND AN INSTANCE INSIDE IT.
    // AND THEN FOR CREATING INSTANCE A FUNCTION OR CONSTRUCTOR AND IN THAT A CONDITION.
    // IF INSTANCE IS NOT CREATED THEN CREATE AN INSTANCE AND IF INSTANCE IS CREATED THEN RETURN THE INSTANCE CREATED.
    // SO, IN THIS CASE SAME INSTANCE WOULD BE RETURNED IF AN INSTANCE IS CREATED.
    // SO ONLY ONE INSTANCE CAN BE CREATED IN A SINGLETON CLASS.

}
