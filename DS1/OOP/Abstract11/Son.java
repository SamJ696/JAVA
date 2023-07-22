package com.DS1.OOP.Abstract11;

// AS THIS IS SUBCLASS SO IT MUST OVERRIDE THE ABSTRACT METHODS IN SUPER CLASS.
// OR IF IT DOES NOT OVERRIDES THEN IT MUST BE DECLARED AS AN ABSTRACT CLASS ITSELF.
public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be the Best Coder ");
    }

    @Override
    void partner(){
        System.out.println("I Love Me");
    }

}
