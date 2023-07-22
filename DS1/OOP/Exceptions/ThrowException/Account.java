package com.DS1.OOP.Exceptions.ThrowException;

public class Account {
    float value;
    public void deposit(float value){
        if (value <= 0){
            throw new IllegalArgumentException();
        }
        else {
            this.value = value;
        }
    }

    public float bal() {
        System.out.println(value);
        return 0;
    }

}
