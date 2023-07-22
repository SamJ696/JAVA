package com.DS1.OOP.Interfaces12;


// EVERY VARIABLE IN AN INSTANCE IS FINAL.
// EVERY FUNCTION IS BY DEFAULT ABSTRACT.
// NO NEED TO WRITE SEPARATELY.

public interface Engine {

    int price = 80000;


    void start();
    void stop();
    void acc();


    // STATIC INTERFACE METHODS SHOULD HAVE A BODY.
    // BECAUSE THEY CANNOT BE INHERITED.

    static void hello(){
        System.out.println("This will have a body.");
    }
}



