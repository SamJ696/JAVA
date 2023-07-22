package com.DS1.OOP.Abstract11;


// IF ANY METHOD IN A CLASS IS ABSTRACT THEN THE CLASS ALSO MUST BE DECLARED AS ABSTRACT.
public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("This is a static method");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career ();
    abstract void partner ();

}
