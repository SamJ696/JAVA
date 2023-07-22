package com.DS1.OOP;
// In Extras Trial 2.

public class Human4 {
    String name;
    int age;
    int salary;
    boolean married;

    // population wil be same for all objects. It will not depend on objects.
    // Therefore, created as static.
    public static long population;

    public Human4(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        // As it does not depend on objects therefore there is no need of using this.population to update it.
        // It would remain to common to all objects.
        // Therefore, it would be updated using the class name itself.
        Human4.population += 1;
    }
}
