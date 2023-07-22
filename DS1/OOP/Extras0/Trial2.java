package com.DS1.OOP.Extras0;

import com.DS1.OOP.Human4;

public class Trial2 {
    public static void main(String[] args) {
        Human4 human1 = new Human4("Sam", 20, 10000, false);
        Human4 human2 = new Human4("Bro", 21, 20000, true);


        // If population is updated using this.population then these both would print 1.
        // As it is now updated using the class Name itself now it would show total obejcts/humans created in the class.
        System.out.println(human1.population);
        System.out.println(human2.population);
    }

    // This does not depend on objects.
    // We can't use non-static members inside a static member. IN GENERAL.
    static void fun (){
       // greeting(); // Can't use this because it requires and instance.
        // But the function we are using it in does not require instance.

        // CANNOT ACCESS NON-STATIC STUFF WITHOUT REFERENCING THEIR INSTANCES IN A STATIC CONTEXT.
        // By creating an object we can access.
        Trial2 obj = new Trial2();
        obj.greeting();
    }

    // We can use a static member inside a non-static member as it does not limit itself.
    void greeting (){
        fun();
        System.out.println("Heello!!!");
    }
}

// WE CANNOT USE THIS IN STATIC FUNCTION DEFINED IN CLASS BECAUSE STATIC DOES NOT DEPEND ON OBJECTS.
// WHEREAS THIS VARIABLE DEPENDS ON OBJECT SO WE CANNOT USE SOMETHING THAT DEPENDS ON OBJECT INSIDE A STATIC.

