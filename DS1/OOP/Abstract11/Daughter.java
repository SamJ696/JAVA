package com.DS1.OOP.Abstract11;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner(){
        System.out.println("I Love Something");
    }

}
