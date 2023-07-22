package com.DS1.OOP.Exceptions.ThrowException;

public class ThrowException {
    public static void show(){
        var account = new Account();
        account.deposit(1);

        account.bal();
    }

    public static void main(String[] args) {
        show();
    }
}
