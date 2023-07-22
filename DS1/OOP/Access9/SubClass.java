package com.DS1.OOP.Access9;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10,"Samyak");
        int n = obj.num;
    }
}
