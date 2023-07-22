package com.DS1.OOP.Interfaces12;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerates");
    }
}
