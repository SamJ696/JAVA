package com.DS1.OOP.Abstract11;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.career();


        // CANNOT CREATE OBJECTS OF ABSTRACT CLASSES DIRECTLY.
        // WE HAVE TO OVERRIDE METHODS IN ORDER TO DO SO.
        // Parent obj = new Parent(23);


        Parent.hello();
    }
}
