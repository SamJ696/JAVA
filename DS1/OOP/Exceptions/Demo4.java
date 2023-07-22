package com.DS1.OOP.Exceptions;

public class Demo4 extends Exception{
    String s1;

    Demo4(String s2){
        s1 = s2;
    }

    @Override
    public String toString(){
        return ("Output String : " + s1);
    }
}

class NewClass {
    public static void main(String[] args) {
        try {
            throw new Demo4("Custom Exception");
        }

        catch (Demo4 demo){
            System.out.println(demo);
        }
    }
}
